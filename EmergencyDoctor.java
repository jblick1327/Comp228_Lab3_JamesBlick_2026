package doctorz;

public class EmergencyDoctor extends Doctor implements MedicalProfessional, Billable {

	public EmergencyDoctor(double personId, int age, String name, String specialization, double consultationFee) {
		super(personId, age, name, specialization, consultationFee);
	}

	public void handleEmergency() {
		System.out.println("Your ligma emergency is being handled");
	}

	@Override
	public void prescribeMedication() {
		System.out.println("You are prescribed medication for your ligma");
	}

	@Override
	public void generateBill() {
		System.out.println("Your bill has been generated");
	}

	@Override
	public void performDuties() {
		System.out.println(this.getName() + " is handling your ligma emergency");
	}
}

