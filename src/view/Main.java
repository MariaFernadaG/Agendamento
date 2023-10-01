/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import model.Agendamento;
import model.Cliente;
import model.Servico;
import model.Usuario;
import model.Pessoa;

/**
 *
 * @author maria
 */
public class Main {
     public static void main(String args[]) {
         String nome= "maria";
         System.out.println("nome");
         Servico servico = new  Servico(1,"barba",30);
         System.out.println(servico.getDescricao());
         System.out.println(servico.getValor());
         
         Cliente cliente = new Cliente(1,"maria","rua xy","34670009");
         System.out.println(cliente.getNome());
         
         
         Usuario usuario= new Usuario(1,"barbeiro","senha");
         System.out.println(usuario.getNome());
         
        Agendamento agendamento = new Agendamento(1, cliente, servico, 30, "18/04/2024 09:15");
        System.out.print(agendamento.getCliente().getNome());
          
     }
}
