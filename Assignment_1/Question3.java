package assignment_1;

import java.util.Scanner;

class Employee {
	int empId;
	String name;

	public Employee() {
		super();
	}

	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}

}

public class Question3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		Employee arr[] = new Employee[5];
		arr[0] = new Employee(10, "Mayur");
		arr[1] = new Employee(40, "Omkar");
		arr[2] = new Employee(70, "Harshad");
		arr[3] = new Employee(20, "Hritik");
		arr[4] = new Employee(30, "Raju");


		System.out.print("Enter the empId : ");
		int empId = sc.nextInt();
		int ans1 = searchById(arr, empId);

		if (ans1 == -1) {
			System.out.println("Element is not prasent");
		} else {
			System.out.println("Element prasent at index " + ans1);
		}

		System.out.print("Enter the Name : ");
		String name = sc.next();
		int ans2 = searchByName(arr, name);
		
		if (ans2 == -1) {
			System.out.println("Element is not prasent");
		} else {
			System.out.println("Element prasent at index " + ans2);
		}

	}

	private static int searchByName(Employee[] arr, String name) {
		// TODO Auto-generated method stub
	
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getName().equals(name)) {
				return i;
			}
		}

		return -1;
	}

	private static int searchById(Employee[] arr, int empId) {
		// TODO Auto-generated method stub
	
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].getEmpId() == empId) {
				return i;
			}
		}

		return -1;
	}

}
