package demo_javacore.sub;

import java.util.ArrayList;
import java.util.Arrays;

import demo_javacore.certificate.certificate;
import demo_javacore.employee.employee;

public class intern extends employee{
	private String major;
	private int semester;
	private String university;
	public intern() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public intern(int id, String fullName, String birthday, String email, String employeeType,
			ArrayList<certificate> certificates, String major, int semester, String university) {
		super(id, fullName, birthday, email, employeeType, certificates);
		this.major = major;
		this.semester = semester;
		this.university = university;
	}



	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}



	@Override
	public String toString() {
		return "intern [major=" + major + ", semester=" + semester + ", university=" + university + ", getId()="
				+ getId() + ", getFullName()=" + getFullName() + ", getBirthday()=" + getBirthday()
				+ ", getCertificates()=" + getCertificates() + ", getEmail()=" + getEmail() + ", getEmployeeType()="
				+ getEmployeeType() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	
	
	
}
