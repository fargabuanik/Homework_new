package hw11Polymorphism;

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