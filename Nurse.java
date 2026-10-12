package doctorz;

public class Nurse extends Person {
	private String department;
	private String shift;

	public Nurse(String department, String shift, double personId, int age, String name) {
		super(personId, age, name);
		this.department = department;
		this.shift = shift;
	}

	public void assistPatient() {
		System.out.println("You are assisted with your ligma");
	}
	
	@Override
	public void performDuties() {
		System.out.println(this.getName() + " is assisting a patient with their ligma");
	}

	public String getDepartment() {
		return department;
	}

	public String getShift() {
		return shift;
	}

}

