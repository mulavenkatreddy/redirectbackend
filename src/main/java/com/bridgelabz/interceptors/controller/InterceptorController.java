package com.bridgelabz.interceptors.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200",allowedHeaders="*",exposedHeaders={"jwtTokens"})
public class InterceptorController{

	@GetMapping(value = "/get")
	public String get(HttpServletRequest request,HttpServletResponse httpResponse) {
		try {
			
			httpResponse.sendRedirect("http://localhost:4200/hello");
			System.err.println("getheader : "+request.getHeader("referer"));
			 	System.err.println("getheader : "+request.getHeader("Referer"));
			System.err.println("request origin: "+request.getHeader("Origin"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return "hello";
	}
	@PostMapping(value = "/post")
	public String post(@RequestParam String msg ) {
		
		return msg;
	}
}
