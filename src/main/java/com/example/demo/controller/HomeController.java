package com.example.demo.controller;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dto.ClienteDTO;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home(HttpServletRequest request) {
		
		System.out.println(request.getHeader("Accept-Language"));
		
		
		return "home";
	}
	
	@PostMapping("/")
	public String home(ClienteDTO clienteDTO) {
		System.out.println(clienteDTO.getNome());
		System.out.println(clienteDTO.getIdade());
		return "redirect:/";
	}
}
