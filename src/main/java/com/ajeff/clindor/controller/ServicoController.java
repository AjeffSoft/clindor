package com.ajeff.clindor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ajeff.clindor.model.Servico;
import com.ajeff.clindor.service.ServicoService;

@Controller
@RequestMapping(value = "servicos")
public class ServicoController {
	
	@Autowired
	private ServicoService service;
	
	@GetMapping("/novo")
	public ModelAndView novo() {
		return new ModelAndView("/servico/CadastroServico");
	}
	
	@GetMapping
	public ModelAndView pesquisar() {
		ModelAndView mv = new ModelAndView("/servico/PesquisarServicos");
		List<Servico> servs = service.listarTodos();
		mv.addObject("servs", servs);
		servs.forEach(s -> System.out.println(s));
		return mv;
	}

}
