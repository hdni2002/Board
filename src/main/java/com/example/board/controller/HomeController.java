package com.example.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller 
public class HomeController {
	
	@GetMapping("/") // 현재경로로 접근 
	public String index() {
		return "index"; // 웹페이지 dddddd
	}
	public String a() {
		return "";
	}
}
