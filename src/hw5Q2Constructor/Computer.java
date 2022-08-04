package hw5Q2Constructor;

public class Computer {

	public String brand;
	public String model;
	public String operatingSystem;
	public int price;
	public char grade;
	public boolean madeInUSA;

	public Computer(){
		System.out.println("This is default constructor is form computer Class");
	}

	public Computer(String brand) {
		this.brand =brand;
		System.out.println("This is " + brand);
	}

	public Computer (String brand,String model,String opratingSystem,int price, char grade,boolean madeInUSA) {
		this.brand = brand;
		this.model = model;
		this.operatingSystem = opratingSystem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		System.out.println("This is computer: " + brand +" My computer model is: " + model +" My computer opratingSystem is: "+opratingSystem +" My computer price is: "+price +" My computer is MadenInUSA: "+madeInUSA);


	}

}