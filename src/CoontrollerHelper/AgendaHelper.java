/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoontrollerHelper;

import static Model.DAO.Banco.servico;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import model.Agendamento;
import model.Cliente;
import model.Servico;
import view.Agenda;

/**
 *
 * @author maria
 */
public class AgendaHelper  implements IHelper{
    private final Agenda view;

    public AgendaHelper(Agenda view) {
        this.view = view;
    }
   
    public void preencherTabela(ArrayList<Agendamento> agendamentos) {
      DefaultTableModel  tableModel = (DefaultTableModel) view.getTableAgendamento().getModel();
      tableModel.setNumRows(0);
      
              //percorrer o table 
      for(Agendamento agendamento: agendamentos){
      
          tableModel.addRow(new Object[]{
              
                     agendamento.getId(),
                     agendamento.getCliente().getNome(),
                     agendamento.getServico().getDescricao(),
                     agendamento.getValor(),
                     agendamento.getDataFormatada(),
                     agendamento.getHoraFormatada(),
                     agendamento.getObservacao()
                    }); 
            } 
        }

    public void preencherClientes(ArrayList<Cliente> clientes) {
       //como pegar o conteudo do combobox
     DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxcliente().getModel();
        for (Cliente cliente : clientes) {
            comboBoxModel.addElement(cliente);
        }
    }
    
    public void preencherServicos(ArrayList<Servico>servicos){
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxservico().getModel();
        for (Servico servico : servicos) {
            comboBoxModel.addElement(servico);
        }
    }
      public Cliente  obterCliente() {
        //getselect para saber qual funcao foi selecionada 
       return (Cliente) view.getjComboBoxcliente().getSelectedItem();
      
    }
    public Servico obterServico() {
        //getselect para saber qual funcao foi selecionada 
       return (Servico) view.getjComboBoxservico().getSelectedItem();
      
    }

    public void setarValor(float valor) {
        //concatenar float vira string
       view.getTxtValor().setText(valor+"");
    }

    @Override
    public Agendamento ObterModelo() {
        //chamar o campo e o           valor
        String idString = view.getId().getText();
        int id = Integer.parseInt(idString);
        Cliente cliente = obterCliente();
        Servico servico = obterServico();
        String valorString = view.getTxtValor().getText();
        float valor = Float.parseFloat(valorString);
        String data = view.getTxtData().getText();
        String hora = view.getTxtHora().getText();
        String dataHora = data + " " + hora;
        String observacao = view.getObservacao().getText();
        Agendamento agendamento = new Agendamento(id, cliente, servico, valor, dataHora,observacao);
        return agendamento;
      //new Agendamento();
      
    }

    @Override
    public void LimparTela() {
       view.getId().setText("0");
       view.getTxtHora().setText(""); 
       view.getTxtData().setText("");
       view.getObservacao().setText("");
    }
   
    }
