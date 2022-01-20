/*
Q. There is a company that manufactures three types of products. In this company, there are 5 salesmen. Each salesman is supposed to sell three products. Write a program to print

(i) The total no of sales by each salesman and

(ii) total sales of each item.

The structure of the class Company is as follows:-

class Company
{
	int products[];
}

HInt:-
Company salesman[]= new Company[5];

Output :-
Enter the sales of 3 items sold by salesman 1: 23 23 45
Enter the sales of 3 items sold by salesman 2: 34 45 63
Enter the sales of 3 items sold by salesman 3: 36 33 43
Enter the sales of 3 items sold by salesman 4: 33 52 35
Enter the sales of 3 items sold by salesman 5: 32 45 64
Total Sales By Salesman 1 = 91
Total Sales By Salesman 2 = 142
Total Sales By Salesman 3 = 112
Total Sales By Salesman 4 = 120
Total Sales By Salesman 5 = 141
Total sales of item 1 = 158
Total sales of item 2 = 198
Total sales of item 3 = 250
 */

import java.util.Scanner;

public class Company {
    int products[] = new int[3];
    public void totalSaleByEachSalesman(Company arr[]){
        int x = 1;
        for (int i = 0; i < arr.length; i++) {
            int c = 0;
            for (int j = 0; j < arr[i].products.length; j++) {
                c = c+arr[i].products[j];
            }
            System.out.println("Total Sales By Salesman " + x + " = " + c);
            x = x+1;
        }
    }
    public void totalSaleOfEachItem(Company arr[]){
        int x = 1;
        for (int i = 0; i < products.length; i++) {
            int c = 0;
            for (int j = 0; j < arr.length; j++) {
                c = c+arr[j].products[i];
            }
            System.out.println("Total sales of item " + x + " = " + c);
            x = x+1;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Company salesman[] = new Company[5];
        int x = 1;
        for (int i = 0; i < salesman.length; i++) {
            System.out.print("Enter the sales of 3 items sold by salesman " + x + ": ");
            x = x+1;
            salesman[i] = new Company();
            for (int j = 0; j < 3; j++) {
                salesman[i].products[j] = input.nextInt();
            }
        }
        Company c1 = new Company();
        c1.totalSaleByEachSalesman(salesman);
        c1.totalSaleOfEachItem(salesman);
    }
}
