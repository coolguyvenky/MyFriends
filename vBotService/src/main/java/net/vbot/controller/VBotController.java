package net.vbot.controller;

import net.vbot.domain.VBotDTO;
import net.vbot.service.VBotService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value= "/vbot" , consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
public class VBotController {

	@Autowired 
	private VBotService vBotSvc;
	
	
	
	@RequestMapping(value= "/search", method=RequestMethod.POST)
	public VBotDTO search(@RequestBody VBotDTO payment) {
		return vBotSvc.search(payment);
	}
}
