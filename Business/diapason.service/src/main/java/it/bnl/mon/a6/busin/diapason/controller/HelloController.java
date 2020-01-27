package it.bnl.mon.a6.busin.diapason.controller;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.bnl.fwk.jrfcore.common.annotation.ServiceInfo;

import it.bnl.mon.a6.busin.diapason.services.IHelloService;

@RestController
@RequestMapping("/helloservice")
public class HelloController {
	
	@Autowired
	private IHelloService helloService;
	
	@GetMapping("/hello/{name}")
	@ServiceInfo(name="hello", version="1.0")
	public String hello(@NotNull @NotEmpty @PathVariable("name") String name) {
		
		return helloService.getHello(name);
		
	}
	
}
