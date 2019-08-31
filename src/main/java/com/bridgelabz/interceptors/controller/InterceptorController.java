package com.bridgelabz.interceptors.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*", exposedHeaders = { "jwtTokens" })
public class InterceptorController {

	static List<String> urllist = new ArrayList<String>();
	
	@GetMapping(value = "/get/{id}")
	public String get(HttpServletRequest request, HttpServletResponse httpResponse, @PathVariable String id) {
		try {
			
				System.out.println(id);
				
				if (urllist.contains(id))
						{
			httpResponse.sendRedirect("https://reg.bridgelabz.com/registerByCode");
				}
				else {
					httpResponse.sendRedirect("https://www.google.com");
				}

			System.err.println("getheader : " + request.getHeader("Referer"));
			
		} catch (IOException e) {

			e.printStackTrace();
		}
		return "hello";
	}
	
	@GetMapping(value = "/generateurl")
	public String  generateUrl() {
		
		UUID uuid = UUID.randomUUID();
		System.out.println("UUID : "+uuid);
		urllist.add(uuid.toString());
		return "http://192.168.1.191:8080/get/"+uuid.toString();
	}
	
	//to create the link 
	//create a link with uuid
	//where you want to redirect url
	//hitcount 

	@PostMapping(value = "/post")
	public String post(@RequestParam String msg) {

		return msg;
	}
}
