package com.tracy.client;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * 
 * @author tracy
 * 2017年9月13日
 */
@Api("helloClient")
@RestController
public class HelloClient {

	
	@RequestMapping(value = "/hello")
	public String hello(@RequestParam String name) {
		return "hello " + name;
	}

}
