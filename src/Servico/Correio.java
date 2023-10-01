/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servico;

import model.Agendamento;

/**
 *
 * @author maria
 */
public class Correio {
    public void NotificarPorEmail(Agendamento agendamento){
        String emailFormatado = formatarEmail(agendamento);
        String destinatario= agendamento.getCliente().getEmail();
        Email email= new Email("Agendamento Barbearia",emailFormatado, destinatario);
        email.enviar();
    }

    private String formatarEmail(Agendamento agendamento) {
        String nomeCliente = agendamento.getCliente().getNome();
        String servico= agendamento.getServico().getDescricao();
        String dataAgendamento = agendamento.getDataFormatada();
        String horaAgendamento= agendamento.getHoraFormatada();
        float valor = agendamento.getValor();
        return "Ola" +"vai dar um tapa no visu... Seu agendamento para"+servico+"Esta marcado para o dia" +dataAgendamento+"as"+ horaAgendamento +"O preço para você sai baratinho fica R$"+valor+"Até";
    }
    
}
