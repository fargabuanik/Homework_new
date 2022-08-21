package hw8Abstraction;

/*
 An Interface can't inherit a regular class or an abstract class by extends keyword.
 
 An Interface can inherit more than one Interface by extends keyword. implements keyword can't be used for inheritance inside Interface
 */

public interface Univetsity extends College, Hospital{
	public void classSize();
	public void playGround();
	public void teacher();




}
