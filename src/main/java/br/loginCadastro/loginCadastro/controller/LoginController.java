package br.loginCadastro.loginCadastro.controller;


import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.loginCadastro.loginCadastro.Model.Usuario;
import br.loginCadastro.loginCadastro.Servise.UsuarioService;







@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(){
        return "/login";
    }


      @Autowired
    private UsuarioService service;

    @PostMapping("/login")
    public String autenticar(@RequestParam String email, @RequestParam String senha, Model model){
        Optional <Usuario> usuario = service.autenticar(email, senha);
        if (usuario.isPresent()) {
              model.addAttribute("usuarioNome", usuario.get().getNome());
            return "home";
        }
        else{
             model.addAttribute("erro", "Email ou senha invalidos");
             return "login";
        }
    }


}
