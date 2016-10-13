package net.zeus.controller;

import net.zeus.domain.ZeusDTO;
import net.zeus.service.ZeusService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value= "/zeus" , consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
public class ZeusController {

	@Autowired 
	private ZeusService zeusSvc;
	
	
	
	@RequestMapping(value= "/ask", method=RequestMethod.POST)
	public ZeusDTO search(@RequestBody ZeusDTO payment) {
		return zeusSvc.search(payment);
	}
}
