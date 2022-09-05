package hw11Polymorphism;


/*
Create a package "hw11Polymorphism" inside your HW project and execute the remaining. Read the question very carefully. Create a class Sister. Can you create several methods with the same name (sister) inside it with the help of below variables?  As a variable, use int age1, int age2, int age3, String age4, int age5, int age6 etc in different combination. Use void type, parameterized type, return type, static type, final type method by different combinations of the above variable. Tell me what is the Method overloading by multiple line comments.  initialize all the methods in TestFamily class. Create another class Niece and inherit (extends) Sister. Override all the possible methods by changing logic. If some methods are not possible to override, please explain why by the multiple line comments comments. Tell me what is the Method overriding by multiple line comments. Initialize all the methods of Niece class in TestFamily class.
 */
public class Sister {
	public void sister() {
		System.out.println("This is a void type mathod from sister class");
	}
	public void sister(int age1,int age2, int age3, String age4, int age5, int age6 ) {
		int total1 = age1 + age2 + age3 + Integer.parseInt(age4) + age5 + age6;
		System.out.println("total age of sister"+ total1);
	}
	public int sister (int age2, int age3) {
		int total2 = age2 + age3;
		System.out.println("total age of sister" + total2);
		return total2;
	}
	public static int sister(int age3, int age2, String age4) {
		int total3= age3 + age2+Integer.parseInt(age4);
		System.out.println("total age of sister" +total3);
		return total3;

	}public int sister (int age1, int age5,int age6) {
		int total4 = age1 + age5 + age6;
		System.out.println("total age of sister" + total4);
		return total4;
}
}