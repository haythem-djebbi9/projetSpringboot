package com.example.marque.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.marque.service.MarqueService;

@Controller
public class MarqueController {

	@Autowired
	MarqueService marqueService;
	@RequestMapping("/showCreate")
	public String showCreate()
	{
	return "createMarque";
	}

}
