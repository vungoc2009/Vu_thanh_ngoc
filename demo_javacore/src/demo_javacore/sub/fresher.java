package demo_javacore.sub;

import java.util.ArrayList;
import java.util.Arrays;

import demo_javacore.certificate.certificate;
import demo_javacore.employee.employee;

public class fresher extends employee {
	private String graduationDate;
	private String graduationRank;
	private String education;
	public fresher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public fresher(int id, String fullName, String birthday, String email, String employeeType,
			ArrayList<certificate> certificates, String graduationDate, String graduationRank, String education) {
		super(id, fullName, birthday, email, employeeType, certificates);
		this.graduationDate = graduationDate;
		this.graduationRank = graduationRank;
		this.education = education;
	}

	public String getGraduationDate() {
		return graduationDate;
	}
	public void setGraduationDate(String graduationDate) {
		this.graduationDate = graduationDate;
	}
	public String getGraduationRank() {
		return graduationRank;
	}
	public void setGraduationRank(String graduationRank) {
		this.graduationRank = graduationRank;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}

	@Override
	public String toString() {
		return "fresher [graduationDate=" + graduationDate + ", graduationRank=" + graduationRank + ", education="
				+ education + ", getId()=" + getId() + ", getFullName()=" + getFullName() + ", getBirthday()="
				+ getBirthday() + ", getCertificates()=" + getCertificates() + ", getEmail()=" + getEmail()
				+ ", getEmployeeType()=" + getEmployeeType() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
}
