package com.ajeff.clindor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "servico")
public class ServicoController {
	
	@GetMapping("/novo")
	public ModelAndView novo() {
		return new ModelAndView("CadastroServico");
	}

}
