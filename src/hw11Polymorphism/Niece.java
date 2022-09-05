package hw11Polymorphism;

public class Niece extends Sister {
	public void sister(int age1, int age2,int age3, String age4, int age5, int age6 ) {
		int  total1 = age1*5 + age2 + age3 +Integer.parseInt(age4) +age5 + age6;
		System.out.println("totla age of sister :" + total1);
	}
	public int sister(int age2, int age3) {
		int total2 = age2 + age3 +3;
		System.out.println("total age of sister :" + total2);
		return total2;
	}	
	public static int sister(int age3, int age2, String age4 ) {
		int total3 = age3 + age2 + Integer.parseInt(age4);
		System.out.println("total age of sister :" +total3);
		return total3;
	}
	public final int sister(int age3, int age5, int age6 ) {
		int total4 = age3 + age5+ age6;
		System.out.println("total age of sister" + total4);
		return total4;
	}
	/* So, static method can't be override, if we remove @override it will work as
	// static method of this Niece class.
	public static int sister(int age2, int age3, String age4 , age5) {
		int total5 = age3 + age2 + Integer.parseInt(age4);
		System.out.println("total age of sister :" +total5);
		return total5;*/

		/* @Override 
		 *  Final type method cannot be Override 
		 public final int sister(int age3, int age5, int age6 ) {
		  int total6 = age3 + age5+ age6; System.out.println("total age of sister" + total4);
		  return total6;
		 */
	}