package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Doctor  {
ArrayList<Patient> PatSize = new ArrayList<Patient>();
	public Object performsSurgery() {
		// TODO Auto-generated method stub
		return false;
	}


	public Object makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
	}

	public void assignPatient(Patient patient)throws DoctorFullException {
		// TODO Auto-generated method stub
		new Patient();
		PatSize.add(patient);
	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return PatSize;
	}

	public void doMedicine() {
		// TODO Auto-generated method stub
		
	}

}
