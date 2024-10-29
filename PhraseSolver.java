/*
 * Activity 2.5.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.Scanner;
  
public class PhraseSolver
{
  /* your code here - attributes */
    private Player player1;
    private Player player2;
    private boolean solved;
    private Board board;
  /* your code here - constructor(s) */ 
  public PhraseSolver() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter name for Player 1: ");
    String player1Name = scanner.nextLine();
    player1 = new Player(player1Name); // Create Player 1

    System.out.print("Enter name for Player 2: ");
    String player2Name = scanner.nextLine();
    player2 = new Player(player2Name); // Create Player 2

    Board board = new Board();  
    boolean solved = false;
    scanner.close();
  }
  /* your code here - accessor(s) */
  
  /* your code here - mutator(s)  */

  public void play()
  {
    boolean solved = false;
    int currentPlayer = 1;

    Scanner input = new Scanner(System.in);
    
    boolean correct = true;
    while (!solved) 
    {
      
      /* your code here - game logic */
      
      
      /* your code here - determine how game ends */
      solved = true; 
    } 
   
  }
  
}