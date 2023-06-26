package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dto.ClienteDTO;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home(@RequestParam String nome,@RequestParam int idade) {
		System.out.println(nome);
		System.out.println(idade);
		return "home";
	}
	
	@PostMapping("/")
	public String home(ClienteDTO clienteDTO) {
		System.out.println(clienteDTO.getNome());
		System.out.println(clienteDTO.getIdade());
		return "redirect:/";
	}
}
