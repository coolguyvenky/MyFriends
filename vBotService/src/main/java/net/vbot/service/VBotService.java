package net.vbot.service;

import java.util.HashMap;
import java.util.Map;

import net.vbot.domain.AnswerUtil;
import net.vbot.domain.ImageDTO;
import net.vbot.domain.VBotDTO;

import org.springframework.stereotype.Service;

@Service
public class VBotService {
	
	
	private static Map<String,String> dataDict;

	
	public VBotDTO search(VBotDTO dto){
		//dto.setResponse(mockGetAnswer(dto.getRequest()));
		dto.setRespText(AnswerUtil.getAnswers(dto.getRequest()));
		
		dto.setLink("www.chase.com");
		dto.setImage(new ImageDTO("smile", "/smile"));
		
		
		return dto;
	}
	
	static{
		dataDict = new HashMap();
		dataDict.put("Q1", "A1");
		dataDict.put("Q2", "A2");
		dataDict.put("Q3", "A3");
		dataDict.put("Q4", "A4");
	}
	private String mockGetAnswer(String intent){
		return dataDict.getOrDefault(intent,"Sorry I didn't get your question!");
	}
	
	
}
