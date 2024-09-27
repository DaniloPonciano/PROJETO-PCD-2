package com.example.demo.Controller;

import org.hibernate.mapping.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.Form.Pessoa.PessoaForm;
import com.example.demo.Model.Deficiencia;

import jakarta.validation.Valid;

@Controller
public class DeficenciaController {

    @GetMapping("/deficiencia")
    public String index() {

        return "deficiencia/listar";
    }

    @GetMapping("/deficiencia/create")
    public String create() {
    
        return "deficiencia/create";
    }

    @PostMapping("/deficiencia/create")
    public String create() {

        return "redirect:/deficiencia";
    }


}
