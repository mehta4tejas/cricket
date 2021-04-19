package com.ecw.cricketscore.pojo;

/**
 * @author elitecore
 *
 */
public class ResponseMessage {
	private String message;
	private boolean result;

	public ResponseMessage()
	{
		
	}
	
	  public ResponseMessage(String message,boolean result) {
	    this.message = message;
	    this.result = result;
	  }

	  public String getMessage() {
	    return message;
	  }

	  public void setMessage(String message) {
	    this.message = message;
	  }

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}
	  
	  
}
