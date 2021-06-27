package com.example.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DemoService;

@Controller
@RestController
public class DemoController {
	
	@Autowired
	DemoService demoService;

	@RequestMapping(value = "demo/fetch", method = RequestMethod.GET, produces = "application/json")
	public Map<String, Object> demoFetch(@RequestBody Map<String, Object> data) {
		return demoService.demoFetchService();
	}
}
