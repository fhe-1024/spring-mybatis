package com.fhe.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fhe.domain.FheHello;
import com.fhe.model.FheHelloView;
import com.fhe.service.IHelloFheService;

@RequestMapping("/index")
@Controller
public class IndexController {
	@Autowired
	private IHelloFheService helloFheService;

	@RequestMapping(path = "/selecthello")
	public String selectHello() {
		Map<String, Object> map = helloFheService.selectHello(1);
		return "index";
	}

	@RequestMapping(path = "insertHello")
	public String insertHello() {
		FheHello fheHello = new FheHello();
		fheHello.setHello("hello");
		fheHello.setWorld("world");
		fheHello.setMoney(1.09);
		helloFheService.insertHello(fheHello);
		return "index";
	}
	
	@RequestMapping(path = "/selecthellomap")
	public String selectHelloMap() {
		FheHelloView view = helloFheService.selectHelloMap(1);
		return "index";
	}
}
