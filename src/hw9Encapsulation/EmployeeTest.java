package hw9Encapsulation;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee = new Employee(); // we put argument in the parameterized method 
		employee.setName("Fargab");
		employee.setAge(77);
		employee.setSex('M');
		employee.setUsCitizen(true);
		System.out.println("Employee name is : " + employee.getName()+",\nage : " +employee.getAge()+",\nsex : "+employee.getSex()+ ",\nUSCitizen "+employee.isUsCitizen());

	}
}


