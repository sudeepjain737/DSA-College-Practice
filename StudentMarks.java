/*
Q. Create an array of 10 students and print the record of those students who got the highest marks and who got minimum marks.
 The structure of student class is as follows
class Student
{
	private int rollno;
	private int marks
	private String name;
}
// create constructor or getter and setter methods as per need
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentMarks {
    private int rollno;
    private int marks;
    private String name;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    StudentMarks(){
        Scanner input = new Scanner(System.in);
        setRollno(input.nextInt());
        setMarks(input.nextInt());
        setName(input.next());
    }

    public static void main(String[] args) {

        ArrayList<StudentMarks>arr = new ArrayList<>(10);
        int x = 1;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the Roll No,Marks,Name of Student-" + x);
            x = x+1;
            arr.add(new StudentMarks());
        }
        Collections.sort(arr,new sortByMarks());
        System.out.println(arr.get(0).getRollno() + " " + arr.get(0).getMarks() + " " + arr.get(0).getName());
        System.out.println(arr.get(9).getRollno() + " " + arr.get(9).getMarks() + " " + arr.get(9).getName());
    }
}

class sortByMarks implements Comparator<StudentMarks>{
    public int compare(StudentMarks s1,StudentMarks s2){
        return s1.getMarks()-s2.getMarks();
    }
}
