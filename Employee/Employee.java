/*
Q. Write a program to create a class (Employee) with the information given below.

1. emp_id
2. name
	1. first_name
	2. last_name
3. address
    1. area
    2. city
    3. state
4. salary
5. designation

Read and print the data by creating  Employee array

Hint:- aggregation / containership
 */

package Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    public int id;
    public float salary;
    public String designation;
    public Name name;
    public Address address;
    Employee(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ID-");
        id = input.nextInt();

        System.out.println("Enter Name of the Employee-->");
        name = new Name();
        System.out.println("first name-");
        name.first_name = input.next();
        System.out.println("last name-");
        name.last_name = input.next();

        System.out.println("Enter Employee Address-->");
        address = new Address();
        System.out.println("area-");
        address.area = input.next();
        System.out.println("city-");
        address.city = input.next();
        System.out.println("state-");
        address.state = input.next();

        System.out.println("Enter Salary-");
        salary = input.nextFloat();

        System.out.println("Enter Designation-");
        designation = input.next();
    }

    public static void main(String[] args) {
        ArrayList<Employee>emp = new ArrayList<>();

        int x = 0;
        for (int i = 0; i < 3; i++) {
            x = x+1;
            System.out.println("Enter details of Employee-" + x);
            emp.add(new Employee());
        }
        int y = 1;
        for (int i = 0; i < emp.size(); i++) {
            System.out.println("Details of Employee-" + y + " is-->");
            System.out.println("id: " + emp.get(i).id);
            System.out.println("Name: " + emp.get(i).name.first_name + " " + emp.get(i).name.last_name);
            System.out.println("Address: " + emp.get(i).address.area + "," + emp.get(i).address.city+ "," + emp.get(i).address.state);
            System.out.println("Salary: " + emp.get(i).salary);
            System.out.println("Designation: " + emp.get(i).designation);
            y = y+1;
        }

    }
}
