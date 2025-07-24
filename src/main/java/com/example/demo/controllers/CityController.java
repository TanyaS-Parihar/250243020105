package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.CityService;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class CityController {

	@Autowired
	CityService rserv;

}
