/*
Q. Consider an array MARKS[4][5] which stores the marks obtained by 4 students in 5 subjects. Now write a program to
(a) find the average marks obtained in each subject.
(b) find the average marks obtained by every student.
(c) find the number of students who have scored below 50 in their average.
(d) display the scores obtained by every student.
 */

import java.util.Scanner;

public class Marks {
    public void averageMarksInEachSubject(int arr[][]) {
        int x = 1;
        for (int i = 0; i < 5; i++) {
            int c = 0;
            for (int j = 0; j < 4; j++) {
                c = c + arr[j][i];
            }
            System.out.println("Average marks obtained in subject " + x + " = " + c / 4);
            x = x + 1;
        }
    }

    public void averageMarksByEveryStudent(int arr[][]) {
        int x = 1;
        for (int i = 0; i < 4; i++) {
            int c = 0;
            for (int j = 0; j < 5; j++) {
                c = c + arr[i][j];
            }
            System.out.println("Average marks obtained by student " + x + " = " + c/5);
            x = x+1;
        }
    }
    public void belowAverage50Students(int[][] arr) {
        int x = 0;
        for (int i = 0; i < 4; i++) {
            int c = 0;
            for (int j = 0; j < 5; j++) {
                c = c + arr[i][j];
            }
            if(c/5 < 50){
                x = x+1;
            }
        }
        System.out.println("No. of Students who have scored below 50 in their average: " + x);
    }
    public void scoreByEveryStudent(int arr[][]) {
        int x = 1;
        for (int i = 0; i < 4; i++) {
            System.out.print("Marks Obtained by Student " + x + " is:");
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Marks m1 = new Marks();
        Scanner input = new Scanner(System.in);
        int MARKS[][] = new int[4][5];
        int x = 1;
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter 5 Subjects Marks of Student " + x + ":");
            for (int j = 0; j < 5; j++) {
                MARKS[i][j] = input.nextInt();
            }
            x = x+1;
        }
        m1.averageMarksInEachSubject(MARKS);
        System.out.println();
        m1.averageMarksByEveryStudent(MARKS);
        System.out.println();
        m1.belowAverage50Students(MARKS);
        System.out.println();
        m1.scoreByEveryStudent(MARKS);
    }
}
