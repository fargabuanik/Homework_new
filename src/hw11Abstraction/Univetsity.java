package hw11Abstraction;

//One keyword use to inheritance in interface
//An Interface can't inherit a regular class or an abstract class by extends keyword
//An Interface can inherit more than one Interface  by extends keyword
//implements keyword can't be used for inheritance inside Interface

public interface Univetsity extends College,Hospital {
	Univetsity univetsity = null;
	public void classSize();
	public void playGround();
	public void teacher();

	default void gymnasium() {
	}
	public static void library() {
	}

}
