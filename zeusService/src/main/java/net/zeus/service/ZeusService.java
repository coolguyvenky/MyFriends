package net.zeus.service;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

import net.zeus.domain.Answer;
import net.zeus.domain.AnswerUtil;
import net.zeus.domain.ImageDTO;
import net.zeus.domain.ZeusDTO;

import org.springframework.stereotype.Service;

@Service
public class ZeusService {
	
	
	private static Map<String,String> dataDict;
	
	private static Map<String,Calendar> login = new HashMap<String, Calendar>();
	
	public ZeusDTO search(ZeusDTO dto){
		//dto.setResponse(mockGetAnswer(dto.getRequest()));
		
		Answer ans = AnswerUtil.getAnswers(dto);
		dto.setRespText(ans.getAnswerText());
		dto.setLink(ans.getUrl());
		dto.setImage(new ImageDTO(ans.getImageDescription(), ans.getImageURL()));
		dto.setUserName(ans.getUserName());
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
	
	private boolean isExisting(String userName, ZeusDTO dto){
		if(login.get(userName) == null){
			login.put(userName, Calendar.getInstance());
			return false;
		}else{
			return true;
		}
	}
	
}
