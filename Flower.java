/*
Q. Write a Java class, Flower, that has three instance variables of type String, int, and float,
which respectively represent the name of the flower, its number of petals, and price.
Your class must include a constructor method that initialises each variable to an appropriate value, and
 your class should include methods for setting the value of each type, and getting the value of each type.
 Create an array of 5 Flower objects and print the value.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Flower {
    private String name;
    private int petals;
    private float price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPetals() {
        return petals;
    }

    public void setPetals(int petals) {
        this.petals = petals;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    Flower(){
        Scanner input = new Scanner(System.in);
        setName(input.next());
        setPetals(input.nextInt());
        setPrice(input.nextFloat());
    }
    public void display(){
        System.out.println(getName() + " " + getPetals() + " " + getPrice());
    }

    public static void main(String[] args) {
        ArrayList<Flower>arr = new ArrayList<>(5);
        int x = 1;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter name, petal, price of the flower-" + x);
            x = x+1;
            arr.add(new Flower());
        }
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).display();
        }

    }
}
