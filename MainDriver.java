package doctorz;

public class MainDriver {

	public static void main(String[] args) {
		Doctor doctor = new Doctor(1, 35, "Dr. Smith", "Family Medicine", 100);
		Nurse nurse = new Nurse("Emergency", "Night", 2, 29, "Alex");
		Surgeon surgeon = new Surgeon("Heart", 3, 3, 48, "Dr. Brown", "Cardiology", 250);
		EmergencyDoctor emergencyDoctor = new EmergencyDoctor(4, 40, "Dr. Jones", "Emergency Medicine", 175);

		System.out.println(doctor.getPersonId() + " " + doctor.getName() + " " + doctor.getAge() + " " + doctor.getSpecialization() + " " + doctor.getConsultationFee());
		doctor.diagnosePatient();
		doctor.performDuties();

		System.out.println(nurse.getPersonId() + " " + nurse.getName() + " " + nurse.getAge() + " " + nurse.getDepartment() + " " + nurse.getShift());
		nurse.assistPatient();
		nurse.performDuties();

		System.out.println(surgeon.getPersonId() + " " + surgeon.getName() + " " + surgeon.getAge() + " " + surgeon.getSpecialization() + " " + surgeon.getConsultationFee() + " " + surgeon.getSurgeryType() + " " + surgeon.getOperatingRoom());
		surgeon.performSurgery();
		surgeon.performDuties();

		System.out.println(emergencyDoctor.getPersonId() + " " + emergencyDoctor.getName() + " " + emergencyDoctor.getAge() + " " + emergencyDoctor.getSpecialization() + " " + emergencyDoctor.getConsultationFee());
		emergencyDoctor.handleEmergency();
		emergencyDoctor.prescribeMedication();
		emergencyDoctor.generateBill();
		emergencyDoctor.performDuties();

		Person person;

		person = doctor;
		person.performDuties();

		person = nurse;
		person.performDuties();

		person = surgeon;
		person.performDuties();

		person = emergencyDoctor;
		person.performDuties();
	}
}

