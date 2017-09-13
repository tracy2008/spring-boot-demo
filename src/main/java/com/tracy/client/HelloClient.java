package com.tracy.client;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author zhangchx
 * 2017年9月13日
 */
@RestController
public class HelloClient {

	@RequestMapping(value = "/hello")
	public String hello(@RequestParam String name) {
		return "hello " + name;
	}

}
