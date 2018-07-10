package oop;

public interface IRate {
	
	// Interface is a class outline
	//Typically methods are written as follows:
	// public void setRate(){
	//}
	// but for Interfaces, since we need only an outline leaving the implementation to the user,
	// we set it up as follows:
	public void setRate();
	public void increaseRate();
}
