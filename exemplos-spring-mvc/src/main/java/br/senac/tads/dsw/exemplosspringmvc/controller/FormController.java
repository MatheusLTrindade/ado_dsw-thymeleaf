package br.senac.tads.dsw.exemplosspringmvc.controller;

import br.senac.tads.dsw.exemplosspringmvc.model.Dados;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/formulario")
public class FormController {

    @GetMapping("/index")
    public ModelAndView formulario() {
        Dados dados = new Dados();
        ModelAndView model = new ModelAndView("index");
        model.addObject(dados);
        return model;
    }

    @PostMapping("/curriculo")
    public ModelAndView salvar(@ModelAttribute Dados dadosRecebidos, RedirectAttributes redirAttr) {
        ModelAndView model = new ModelAndView("curriculo");
        model.addObject("title", "Curriculo | " + dadosRecebidos.getNome());
        model.addObject("nome", dadosRecebidos.getNome());
        model.addObject("email", dadosRecebidos.getEmail());
        model.addObject("telefone", dadosRecebidos.getTelefone());
        model.addObject("nascimento", dadosRecebidos.getNascimento());
        model.addObject("cargo", dadosRecebidos.getCargo());
        model.addObject("linkedin", dadosRecebidos.getLinkedin());
        model.addObject("github", dadosRecebidos.getGithub());
        model.addObject("linguagens", dadosRecebidos.getLinguagens());
        return model;
    }
}
