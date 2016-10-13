package net.zeus.domain;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QA {
	
	private List<String> questionKeys;
	
	private Answer answer;
	
	public QA(String question , Answer answer){
		if(question != null){
			questionKeys = new ArrayList<>();
			String[] qS = question.split("\\s");
			questionKeys = Arrays.asList(qS);
			if(answer != null){
				this.answer = answer;
			}
		}
	}
	
	public int getScore(List<String> question){
		int score = 0;
		for(String q: question){
			if(questionKeys.contains(q))
				score++;
		}
		return score;
	}
	
	public Answer getAnswer(){
		return answer;
	}
	
	

}
