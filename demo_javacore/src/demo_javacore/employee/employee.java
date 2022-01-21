package demo_javacore.employee;

import java.util.ArrayList;
import java.util.Arrays;

import demo_javacore.certificate.certificate;

public abstract class employee {
	private int id;
	private String fullName;
	private String birthday;
	private String email;
	private String employeeType;
	private ArrayList<certificate> certificates;
	
	public employee(int id, String fullName, String birthday, String email, String employeeType,
			ArrayList<certificate> certificates) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.birthday = birthday;
		this.email = email;
		this.employeeType = employeeType;
		this.certificates = certificates;
	}
	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public ArrayList<certificate> getCertificates() {
		return certificates;
	}
	public void setCertificates(ArrayList<certificate> certificates) {
		this.certificates = certificates;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}
	@Override
	public String toString() {
		return "employee [id=" + id + ", fullName=" + fullName + ", birthday=" + birthday + ", email=" + email
				+ ", employeeType=" + employeeType + ", certificates=" + certificates + "]";
	}
	
	
}
