package com.spring.model;

public class tagsModel {
	
	int tagId;
	String tagDescription;
	
	public tagsModel() {
		
	}
	
	
	public tagsModel(int tagId, String tagDescription) {
		super();
		this.tagId = tagId;
		this.tagDescription = tagDescription;
	}


	public int getTagId() {
		return tagId;
	}


	public void setTagId(int tagId) {
		this.tagId = tagId;
	}


	public String getTagDescription() {
		return tagDescription;
	}


	public void setTagDescription(String tagDescription) {
		this.tagDescription = tagDescription;
	}


	@Override
	public String toString() {
		return "tagsModel [tagId=" + tagId + ", tagDescription=" + tagDescription + "]";
	}
	
	
	
	
	

}
