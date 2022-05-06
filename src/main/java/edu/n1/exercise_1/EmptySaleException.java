package edu.n1.exercise_1;

public class EmptySaleException extends Exception{

	private static final long serialVersionUID = -384155573411661984L;
	
	public EmptySaleException (String message) {
		super(message);
	}
}
