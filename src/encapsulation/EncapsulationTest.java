package encapsulation;

public class EncapsulationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		
		person.setId(100);
		person.setName("Bhagyashri Deshmukh");
		person.setAddress("Pune");
		
		System.out.println("Person id is : "+person.getId());
		System.out.println("Person Name is : "+person.getName());
		System.out.println("Person Address is : "+person.getAddress());
	}

}
