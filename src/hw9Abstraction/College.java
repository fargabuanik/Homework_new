package hw9Abstraction;

//An Interface can't inherit a regular class or an abstract class by extends keyword
//An Interface can inherit more than one Interface by extends keyword
//implements keyword can't be used for inheritance inside Interface

public interface College {
	public void commonRoom();
	public abstract void laboratory();
	public void lanauageClub();

	default void dorm() {
		
	}
	public static void studyRoom() {
		
	}
	
}
