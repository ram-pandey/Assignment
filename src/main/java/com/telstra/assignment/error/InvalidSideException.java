package com.telstra.assignment.error;

public class InvalidSideException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7748057096415955225L;
	private String errorCode;
	private String statusCode;
	private String timeStamp;

	public InvalidSideException(String errorCode, String statusCode, String timeStamp) {

		this.errorCode = errorCode;
		this.statusCode = statusCode;
		this.timeStamp = timeStamp;

	}

	public String getErrorCode() {

		return errorCode;
	}

	public String getStatusCode() {

		return statusCode;

	}

	public String getTimeStamp() {

		return timeStamp;
	}

	@Override
	public String toString() {
		return "InvalidSideException [errorCode=" + errorCode + ", statusCode=" + statusCode + "timeStamp=" + timeStamp
				+ "]";
	}
}
