/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import CoontrollerHelper.AgendaHelper;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Servico.Correio;
import java.util.ArrayList;
import model.Agendamento;
import model.Cliente;
import model.Servico;
import view.Agenda;

/**
 *
 * @author maria
 */
public class AgendaController {
    private final Agenda view;
    private final AgendaHelper helper;

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
   

    public void atualizaTabela() {
      //buscar agendamento
        AgendamentoDAO agendamentoDAO= new AgendamentoDAO();
        agendamentoDAO.selectAll();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
        
        // exibir lista
        helper.preencherTabela(agendamentos);
        
    }

    public void atualizaCliente(){
        //buscar cliente banco de dados 
        ClienteDAO clienteDAO =new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
        //exibir clientes
        helper.preencherClientes(clientes);
        
    }

    public void atualizarServico(){
        ServicoDAO servicoDAO = new ServicoDAO();
       ArrayList<Servico> servicos= servicoDAO.selectAll();
        helper.preencherServicos(servicos);
    }

    public void atualizaValor(){
       Servico servico = helper.obterServico();
       helper.setarValor(servico.getValor());
       
    }
    public void Agendar(){
       //buscar objeto agendamento 
       Agendamento agendamento = helper.ObterModelo();
       new AgendamentoDAO().insert(agendamento);
       //salvar no banco de dados 
       Correio correio = new Correio();
       correio.NotificarPorEmail(agendamento);
       //mandar email
       atualizaTabela();
       helper.LimparTela();
       //atualiza tabela
       
    }
    
}
