package com.gnp.demo.trupper.exception;

public class TrupperException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public TrupperException() {
		super();
	}
	
	public TrupperException(final String arg0, final Throwable arg1) {
		super(arg0, arg1);
	}
	
	public TrupperException(final String arg0) {
		super(arg0);
	}
	
	public TrupperException(final Throwable arg0) {
		super(arg0);
	}

}
