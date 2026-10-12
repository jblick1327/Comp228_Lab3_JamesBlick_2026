package doctorz;

public class Doctor extends Person {

	private String specialization;
	private double consultationFee;
	
	public Doctor(double personId, int age, String name, String specialization, double consultationFee) {
		super(personId, age, name);
		this.specialization = specialization;
		this.consultationFee = consultationFee;
	}
	
	public void diagnosePatient() {
		System.out.println("You are diagnosed with ligma.");
	}

	@Override
	public void performDuties() {
		System.out.println(this.getName() + " is diagnosing you with ligma");
	}

	public String getSpecialization() {
		return specialization;
	}

	public double getConsultationFee() {
		return consultationFee;
	}
}

