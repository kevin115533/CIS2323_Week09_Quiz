package Yahtzee;

public class CheatException extends Exception{
	public CheatException(){
		super();
	}
	public CheatException(String message){
		super(message);
	}
	public CheatException(String message, Throwable cause){
		super(message, cause);
	}
	public CheatException(Throwable cause){
		super(cause);
	}
}