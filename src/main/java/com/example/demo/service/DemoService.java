package com.example.demo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

	public Map<String, Object> demoFetchService() {
		Map<String, Object> m = new HashMap<>();
		m.put("message", "Hello World");
		return m;
	}

}
