package demo_javacore;

import java.util.ArrayList;
import java.util.Scanner;

import demo_javacore.certificate.certificate;
import demo_javacore.employee.employee;
import demo_javacore.sub.experience;
import demo_javacore.sub.fresher;
import demo_javacore.sub.intern;

public class phuong_thuc_imp {
	public Scanner sc = new Scanner(System.in);

	public void input(ArrayList<employee> employees, int m) {
	
		for (int j = 0; j < m; j++) {
			System.out.print("nhập id ");
			int id = Integer.parseInt(sc.nextLine());
			System.out.print("fullName ");
			String fullName = sc.nextLine();
			System.out.print("birthday ");
			String birthday = sc.nextLine();
			System.out.print("email");
			String email = sc.nextLine();
			System.out.print("nhập số chứng chỉ của nhân viên ");
			int n = Integer.parseInt(sc.nextLine());
			ArrayList<certificate> certificates = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				System.out.print("certificatedId ");
				int certificatedId = Integer.parseInt(sc.nextLine());
				System.out.print("certificatedName ");
				String certificatedName = sc.nextLine();
				System.out.print("certificatedRank ");
				String certificatedRank = sc.nextLine();
				System.out.print("certificatedDate ");
				String certificatedDate = sc.nextLine();
				certificate Certificate = new certificate(certificatedId, certificatedName, certificatedRank,
						certificatedDate);
				certificates.add(Certificate);
			}
			System.out.println("nhập kiểu nhân viên 0 : Experience , 1 : fresher , 2 : intern");
			int a = Integer.parseInt(sc.nextLine());
			if (a == 0) {
				String employeeType = "Experience ";
				System.out.print("explnYear ");
				int explnYear = Integer.parseInt(sc.nextLine());
				System.out.print("proSkill ");
				String proSkill = sc.nextLine();
				experience Experience = new experience(id, fullName, birthday, email, employeeType, certificates,
						explnYear, proSkill);
				employees.add(Experience);
			}
			if (a == 1) {
				String employeeType = "fresher";
				System.out.print("graduationDate ");
				String graduationDate = sc.nextLine();
				System.out.print("graduationRank ");
				String graduationRank = sc.nextLine();
				System.out.print("education ");
				String education = sc.nextLine();
				fresher Fresher = new fresher(id, fullName, birthday, email, employeeType, certificates, graduationDate,
						graduationRank, education);
				employees.add(Fresher);
			}
			if (a == 2) {
				String employeeType = "intern";
				System.out.print("major ");
				String major = sc.nextLine();
				System.out.print("semester ");
				int semester = Integer.parseInt(sc.nextLine());
				System.out.print("university");
				String university = sc.nextLine();
				intern Intern = new intern(id, fullName, birthday, email, employeeType, certificates, major, semester,
						university);
				employees.add(Intern);
			}
			if(check_id(employees, id)) {
				System.out.println("id này bị trùng");
				int r = employees.size();
				employees.remove(j);
				System.out.println("bạn hãy nhập lại thông tin nhân viên này");
				input(employees, 1);
			}
		}

	}
	public void showInfoAll(ArrayList<employee> employees) {
		if(employees.size() ==0 ) {
			System.out.println("danh sách trống");
		}else {
			for(int i =0 ; i< employees.size(); i++) {
				System.out.println(employees.get(i).toString());
			}
		}
	}
	public void showInfoType(ArrayList<employee> employees , String a) {
		int count = 0;
		for(int i =0 ; i< employees.size(); i++) {
			if(employees.get(i).getEmployeeType().equals(a)) {
				System.out.println(employees.get(i).toString());
				count ++;
			}
		}
		if(count == 0) {
			System.out.println("công ty k có thể loại này");
		}
	}
	public void showInfoId(ArrayList<employee> employees , int id) {
		int count = 0;
		for(int i =0 ; i< employees.size(); i++) {
			if(employees.get(i).getId()==id) {
				System.out.println(employees.get(i).toString());
				count ++;
			}
		}
		if(count ==0 ) {
			System.out.println("công ty k có nhân viên này");
		}
	}
	public void deleteAll(ArrayList<employee> employees) {
		employees.removeAll(employees);
	}
	public void deleteType(ArrayList<employee> employees , String a) {
		int count = 0;
		for(int i =0 ; i< employees.size(); i++) {
			if(employees.get(i).getEmployeeType().equals(a)) {
				employees.remove(i);
				count ++;
			}
		}
		if(count == 0) {
			System.out.println("công ty k có thể loại này");
		}
	}
	public static void deleteId(ArrayList<employee> employees , int id) {
		int count = 0;
		for(int i =0 ; i< employees.size(); i++) {
			if(employees.get(i).getId()==id) {
				employees.remove(i);
				count ++;
			}
		}
		if(count ==0 ) {
			System.out.println("công ty k có nhân viên này");
		}
	}
	public static boolean check_id(ArrayList<employee> employees , int id) {
		int count = 0;
		for(int i =0 ; i< employees.size() ; i++) {
			if(employees.get(i).getId() == id) {
				count ++;
			}
		}
		if(count > 1 ) {
			return true ;
		}
		return false;
	}
	 
}
