package demo_javacore;

import java.util.ArrayList;
import java.util.Scanner;

import demo_javacore.certificate.certificate;
import demo_javacore.employee.employee;

public class main {
	public static void main(String[] args) {
		phuong_thuc_imp a = new phuong_thuc_imp();
		Scanner sc = new Scanner(System.in);
		ArrayList<employee> employees = new ArrayList<>();
		ArrayList<certificate> certificates = new ArrayList<>();
		while (true) {
			System.out.println("////////////////////////////////");
			System.out.println("chức năng bạn muốn là ");
			System.out.println("1 : nhập danh sách nhân viên ");
			System.out.println("2 : thêm nhân viên ");
			System.out.println("3 : xem thông tin nhân viên ");
			System.out.println("4 : xoá nhân viên ");
			System.out.println("////////////////////////////////");
			int b = Integer.parseInt(sc.nextLine());
			switch (b) {
			case 1:
				System.out.println("nhập danh sách nhân viên");
				System.out.print("nhập số lượng nhân viên ");
				int n = Integer.parseInt(sc.nextLine());
				a.input(employees, n);
				break;
			case 2:
				System.out.print("nhập số lượng nhân viên cần thêm ");
				int c = Integer.parseInt(sc.nextLine());
				a.input(employees, c);
				break;
			case 3:
				while (true) {
					System.out.println("////////////////////////////////");
					System.out.println("bạn muốn xem thông tin");
					System.out.println("1:xem thông tin toàn bộ nhân viên");
					System.out.println("2:xem thông tin toàn bộ nhân viên intern , fresher hay experience");
					System.out.println("3:xem thông tin của nhân viên");
					System.out.println("4:quay về menu ban đầu");
					System.out.println("////////////////////////////////");
					int d = Integer.parseInt(sc.nextLine());
					switch (d) {
					case 1:
						a.showInfoAll(employees);
						break;
					case 2:
						System.out.println("vị trí bạn muốn xem thông tin là ");
						String e = sc.nextLine();
						a.showInfoType(employees, e);
						break;
					case 3:
						System.out.print("id nhân viên bạn muốn xem là ");
						int id = Integer.parseInt(sc.nextLine());
						a.showInfoId(employees, id);
						break;
					}
					if(d==4) {
						break;
					}
				}
				break;
			case 4:
				
				while(true) {
					System.out.println("////////////////////////////////");
					System.out.println("bạn muốn xoá thông tin");
					System.out.println("1:xoá thông tin toàn bộ nhân viên");
					System.out.println("2:xoá thông tin toàn bộ nhân viên intern , fresher hay experience");
					System.out.println("3:xoá thông tin của nhân viên");
					System.out.println("4:quay về menu ban đầu");
					System.out.println("////////////////////////////////");
					int e = Integer.parseInt(sc.nextLine());
					switch(e) {
					case 1 :
						a.deleteAll(employees);
						break;
					case 2 :
						System.out.println("vị trí bạn muốn xem thông tin là ");
						String g = sc.nextLine();
						a.deleteType(employees, g);
						break;
					case 3 :
						System.out.print("id nhân viên bạn muốn xem là ");
						int id = Integer.parseInt(sc.nextLine());
						a.deleteId(employees, id);
						break;
					
					}
					if(e == 4) {
						break;
					}
				}
			}
		}
	}

}
