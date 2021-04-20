package com.i3tv.test;

public class UserNotFounException extends IllegalArgumentException {

	private static final long serialVersionUID = -5253146488883318730L;

	public UserNotFounException() {
		super();
	}

	public UserNotFounException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public UserNotFounException(String arg0) {
		super(arg0);
	}

	public UserNotFounException(Throwable arg0) {
		super(arg0);
	}

}
