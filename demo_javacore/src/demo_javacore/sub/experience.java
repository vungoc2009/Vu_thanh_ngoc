package demo_javacore.sub;

import java.util.ArrayList;
import java.util.Arrays;

import demo_javacore.certificate.certificate;
import demo_javacore.employee.employee;

public class experience extends employee{
	private int explnYear;
	private String proSkill;
	
	public experience(int id, String fullName, String birthday, String email, String employeeType,
			ArrayList<certificate> certificates, int explnYear, String proSkill) {
		super(id, fullName, birthday, email, employeeType, certificates);
		this.explnYear = explnYear;
		this.proSkill = proSkill;
	}
	public experience() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getExplnYear() {
		return explnYear;
	}
	public void setExplnYear(int explnYear) {
		this.explnYear = explnYear;
	}
	public String getProSkill() {
		return proSkill;
	}
	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	}
	@Override
	public String toString() {
		return "experience [explnYear=" + explnYear + ", proSkill=" + proSkill + ", getId()=" + getId()
				+ ", getFullName()=" + getFullName() + ", getBirthday()=" + getBirthday() + ", getCertificates()="
				+ getCertificates() + ", getEmail()=" + getEmail() + ", getEmployeeType()=" + getEmployeeType()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	
	
	
}
