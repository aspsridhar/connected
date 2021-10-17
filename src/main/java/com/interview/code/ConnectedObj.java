package com.interview.code;

public class ConnectedObj {
	
	private String fileName;
	private String from;
	private String to;
	
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	
	
	@Override
	public String toString() {
		
		/*
		 * return "ConnectedObj [fileName=" + fileName + ", from=" + from + ", to=" + to + ", getFileName()="
				+ getFileName() + ", getFrom()=" + getFrom() + ", getTo()=" + getTo() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		 */
		
		return "ConnectedObj [fileName=" + fileName + ", from=" + from + ", to=" + to +"]";
		
		
	}
	
	
	
	
	
	

}
