package doctorz;

public class Surgeon extends Doctor {
	private String surgeryType;
	private int operatingRoom;

	public Surgeon(String surgeryType, int operatingRoom, double personId, int age, String name, String specialization, double consultationFee) {
		super(personId, age, name, specialization, consultationFee);
		this.surgeryType = surgeryType;
		this.operatingRoom = operatingRoom;
	}

	public void performSurgery() {
		System.out.println("You are undergoing surgery for your ligma");
	}
	
	@Override
	public void performDuties() {
		System.out.println(this.getName() + " is performing surgery on you for your ligma");
	}

	public String getSurgeryType() {
		return surgeryType;
	}

	public int getOperatingRoom() {
		return operatingRoom;
	}
}

