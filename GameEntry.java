/*
Q. Create an application that store a sequence of high score entries(with name and score) for a video game in an array.

A Java class, GameEntry, representing a game entry is as follows:-

public class GameEntry {
  private int score;
  private String name;
  public GameEntry(int score, String name) {
    this.score = score;
    this.name = name;
  }
  // Getter methods that returns the name and score
  public int getScore() { return score; }
  public String getName() { return name; }
 // here i am returning a string representation of the entry
  @Override
  public String toString() {
    return "("+score + ", "+ name+ ")";
  }
}
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class GameEntry {
    private int score;
    private String name;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    GameEntry(){
        Scanner input = new Scanner(System.in);
        setName(input.next());
        setScore(input.nextInt());
    }
    public String toString(){
        return getScore()+","+getName();
    }

    public static void main(String[] args) {
        ArrayList<GameEntry>gm = new ArrayList<>();
        for (int i = 0; i < 5; i++) {

            gm.add(new GameEntry());
        }
        Collections.sort(gm,new SortByScore());
        for (int i = 0; i < gm.size(); i++) {
            System.out.println(gm.get(i).toString());
        }
    }
}
class SortByScore implements Comparator<GameEntry> {
    public int compare(GameEntry g1 , GameEntry g2){
        return g2.getScore()-g1.getScore();
    }
}