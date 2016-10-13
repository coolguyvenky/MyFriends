package net.zeus.domain;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.DEFAULT, isGetterVisibility = JsonAutoDetect.Visibility.NONE)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ZeusDTO {

	private String request;
	private String respText;
	private String link;
	private ImageDTO image;
	private String userName;
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	private String type;
	public ZeusDTO() {
	}

	public String getRespText() {
		return respText;
	}

	public void setRespText(String respText) {
		this.respText = respText;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public ImageDTO getImage() {
		return image;
	}

	public void setImage(ImageDTO image) {
		this.image = image;
	}



	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
	}


/*	public VBotDTO(String id, String type, String request, String respText, String respUrl) {
	
		this.id = id;
		this.type =type;
		this.request = request;
		this.response = response;
		
	
	}*/
	
	
	
   public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


}
