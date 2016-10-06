package com.virtusa.chatbot.ai.nlp;

public class Answer {
	
	private String answerText;
	
	private String url;
	
	private String imageDescription;
	
	private String imageURL;
	
	public Answer(String answerText){
		this.answerText = answerText;
	}
	
	public Answer(String answerText , String url){
		this.answerText = answerText;
		this.url = url;
	}

	public Answer(String answerText , String url , String imgDesc , String imgeUrl){
		this.answerText = answerText;
		this.url = url;
		this.imageDescription = imgDesc;
		this.imageURL = imgeUrl;
	}
	
	public String getAnswerText() {
		return answerText;
	}

	public void setAnswerText(String answerText) {
		this.answerText = answerText;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getImageDescription() {
		return imageDescription;
	}

	public void setImageDescription(String imageDescription) {
		this.imageDescription = imageDescription;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	
	public String toString(){
		String resp = "";
		if(answerText != null)
			resp +=answerText+"\n";
		if(url != null)
			resp +=url+"\n";
		if(imageDescription != null)
			resp +=imageDescription+"\n";
		if(imageURL != null)
			resp +=imageURL+"\n";
		return resp;
	}

}
