/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CoontrollerHelper;

import model.Usuario;
import view.Login;

/**
 *
 * @author maria
 */
public class LoginHelper implements IHelper{
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
    public Usuario ObterModelo(){
      String nome = view.getTxtusuario().getText();
      String senha = view.getTxtsenha().getText();
        
      Usuario modelo = new Usuario(0,nome,senha);
       return modelo;   
    }
    public void SetarModelo(Usuario modelo){
       String nome = modelo.getNome();
       String senha = modelo.getSenha();
       view.getTxtusuario().setText(nome);
       view.getTxtsenha().setText(senha);
    }
    public void LimparTela(){
       view.getTxtusuario().setText("");
       view.getTxtsenha().setText(""); 
       
    }

   
    
    
}
