/*
 * Activity 2.5.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player
{
  /* your code here - attributes */
  private String name;
  private int score;
  /* your code here - constructor(s) */ 

  public Player(String inputName) {
    System.out.println("Enter player name: ");
    Scanner scanner = new Scanner(System.in);
    String newName = scanner.nextLine();

    String name = newName;
    System.out.println("Hello and welcome to the game " + name);
    int score = 0;


  }

  /* your code here - accessor(s) */ 
    public String getName(){
      return name;
    }
    public void setName(String inputName){
      name = inputName;
    }
    public int getPoints(){
      return score;
    }
    public void addToPoints(int value){
      score += value;
    }
  /* your code here - mutator(s) */ 
}