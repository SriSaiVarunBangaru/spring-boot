package com.spring.model;

public class tagModel {
	
	int tagId;
	String tagDesc;
	
	public tagModel() {
		
	}
	
	public tagModel(int tagId, String tagDesc) {
		super();
		this.tagId = tagId;
		this.tagDesc = tagDesc;
	}

	public int getTagId() {
		return tagId;
	}

	public void setTagId(int tagId) {
		this.tagId = tagId;
	}

	public String getTagDesc() {
		return tagDesc;
	}

	public void setTagDesc(String tagDesc) {
		this.tagDesc = tagDesc;
	}

	@Override
	public String toString() {
		return "tagModel [tagId=" + tagId + ", tagDesc=" + tagDesc + "]";
	}
	
	
	
	

}
