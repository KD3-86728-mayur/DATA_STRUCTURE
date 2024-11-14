package assignment_2;

import java.util.Arrays;

class Employee {
	int empId;
	String name;
	double salary;

	public Employee() {
		super();
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}


public class Question2 {
	
	public static void insertionById(Employee emp[]) {
		
		for(int i=1;i<emp.length;i++) {
			Employee temp = emp[i];
			
			int j;
			for(j = i-1;j>=0 && emp[j].getSalary() < temp.getSalary();j--) {
				emp[j+1] = emp[j];
			}
			emp[j+1] = temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Employee arr[] = new Employee[5];
				arr[0] = new Employee(10, "Mayur",20000);
				arr[1] = new Employee(40, "Omkar",10000);
				arr[2] = new Employee(70, "Harshad",70000);
				arr[3] = new Employee(20, "Hritik",40000);
				arr[4] = new Employee(30, "Raju",30000);

				System.out.println("Before sort by salary : "+Arrays.toString(arr));
				insertionById(arr);
				System.out.println("After sort by salary : "+Arrays.toString(arr));
	}

}
