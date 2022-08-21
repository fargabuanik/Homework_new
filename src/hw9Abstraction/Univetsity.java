package hw9Abstraction;

public interface Univetsity extends College,Hospital {
	public void classSize();
	public void playGround();
	public void teacher();
	
	default void gymnasium() {
	}
		public static void library() {
	}

}
