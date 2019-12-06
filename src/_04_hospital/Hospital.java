package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
	ArrayList<Doctor> DocSize = new ArrayList<Doctor>();
	ArrayList<Patient> PatSize = new ArrayList<Patient>();

	public void addDoctor(GeneralPractitioner generalPractitioner) {
		// TODO Auto-generated method stub
		new GeneralPractitioner();
		DocSize.add(generalPractitioner);
	}

	public void addDoctor(Surgeon surgeon) {
		// TODO Auto-generated method stub
		new Surgeon();
		DocSize.add(surgeon);
	}

	public List<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		List<Doctor> ans = DocSize;
		return ans;
	}

	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		PatSize.add(patient);
	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		List <Patient> ans  = PatSize;
		return ans;
	}

	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub

	}

}
