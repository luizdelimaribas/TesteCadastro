package br.loginCadastro.loginCadastro.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import br.loginCadastro.loginCadastro.DTO.UsuarioDTO;
import br.loginCadastro.loginCadastro.Servise.UsuarioService;

import jakarta.validation.Valid;

@Controller
public class CadastroController {

   private final UsuarioService service;

    public CadastroController(UsuarioService service) {
        this.service = service;
    }

    @GetMapping("/cadastro")
    public String mostrarCadastro(Model model){
          model.addAttribute("usuarioDTO", new UsuarioDTO());
        return "cadastro";
    }

    @PostMapping("/cadastro")
    public String processarCadastro(@Valid UsuarioDTO usuarioDTO, BindingResult result){
        if (result.hasErrors()) {
            return "cadastro";
        }
        service.cadastrar(usuarioDTO);
        return "redirect:/login";
    }
    
    
}





