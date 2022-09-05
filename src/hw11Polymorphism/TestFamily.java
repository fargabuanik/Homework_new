package hw11Polymorphism;

public class TestFamily {
	public static void main(String[] args) {
		System.out.println("\n----Sister class-----/n");
		Sister sister =new Sister();
		sister.sister(5, 6, 7, "8", 9, 10); // void type parameterized method initialized
		sister.sister(6, 7); // return type parameterized method  initialized
		sister.sister(7, 8, 9); // return type parameterized method  initialized
		sister.sister(8, 9, 10); // return type parameterized method  initialize
		sister.sister(); // void type method initialized
		System.out.println("\n-----niece class------/n");
		Niece niece = new Niece();
		niece.sister(5, 6, 7, "8", 9, 10); // void type parameterized method initialized
		niece.sister(6, 7); // return type parameterized method  initialized
		niece.sister(7, 8, 9); // return type parameterized method  initialized
		niece.sister(8, 9,10); // return type parameterized method  initialized
		niece.sister(); // void type method initialized
	}
}
