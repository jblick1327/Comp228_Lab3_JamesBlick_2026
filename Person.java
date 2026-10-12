package doctorz;

public class Person {
	private double personId;
	private int age;
	private String name;
	
	public Person (double personId, int age, String name) {
		this.personId = personId;
		this.age = age;
		this.name = name;
	}
	public void performDuties() {
		System.out.printf("%s is performing their duties\n", this.name);
	}

	public double getPersonId() {
		return personId;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
	
}

