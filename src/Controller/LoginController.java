/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import CoontrollerHelper.LoginHelper;
import Model.DAO.UsuarioDAO;
import model.Usuario;
import view.Login;
import view.MenuPrincipal;

/**
 *
 * @author maria
 */
public class LoginController {

    private final Login view;
    private LoginHelper helper;
        

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    public void EntrarNoSistema(){
      Usuario usuario =  helper.ObterModelo();
      UsuarioDAO usuarioDAO = new UsuarioDAO();
     Usuario usuarioAutenticado =  usuarioDAO.selectPorNomeESenha(usuario);
     if(usuarioAutenticado!= null){
        MenuPrincipal menu= new MenuPrincipal();
        menu.setVisible(true);
        this.view.dispose();
     }else{
        view.exibeMensagem("Usuário inválido");
     }
    }
    public void FizTarefa(){
        System.out.println("busquei algo do banco de dados");
        this.view.exibeMensagem("executei o fiz tarefa");
        
    }
}
