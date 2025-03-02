
import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String player1;
        String player2;
        int player1count = 0;
        int player2count = 0;
        boolean valid = false;
        boolean done = false;
        String playing;
        do {
            do {
                System.out.print("what is player 1s move[R, P, S]:");
                player1 = in.next();
                if (player1.equalsIgnoreCase("R") || player1.equalsIgnoreCase("S") || player1.equalsIgnoreCase("P")) {
                    valid = true;


                } else {

                    System.out.print("you did not enter the correct input\n");

                }

            }
            while (!valid);
            do {
                System.out.print("what is player 2s move[R, P, S]:");
                player2 = in.next();
                if (player2.equalsIgnoreCase("R") || player2.equalsIgnoreCase("S") || player2.equalsIgnoreCase("P")) {
                    valid = true;


                } else {

                    System.out.print("you did not enter the correct input\n");

                }


            }
            while (!valid);

            if (player1.equalsIgnoreCase("R") && player2.equalsIgnoreCase("S")){

                System.out.print("Rock beats Scissors, Player 1 wins\n");
                player1count ++;
                System.out.print("player one score:" + player1count);
                System.out.print("\nplayer two score:" + player2count);
            }
            else if (player1.equalsIgnoreCase("P") && player2.equalsIgnoreCase("R")){

                System.out.print("Paper beats Rock, Player 1 wins\n");
                player1count ++;
                System.out.print("player one score:" + player1count);
                System.out.print("\nplayer two score:" + player2count);
            }
            else if (player1.equalsIgnoreCase("S") && player2.equalsIgnoreCase("P")){

                System.out.print("Scissors beats Paper, Player 1 wins\n");
                player1count ++;
                System.out.print("player one score:" + player1count);
                System.out.print("\nplayer two score:" + player2count);
            }
            else if (player2.equalsIgnoreCase("R") && player1.equalsIgnoreCase("S")){

                System.out.print("Rock beats Scissors, Player 2 wins\n");
                player2count ++;
                System.out.print("player one score:" + player1count);
                System.out.print("\nplayer two score:" + player2count);
            }
            else if (player2.equalsIgnoreCase("P") && player1.equalsIgnoreCase("R")){

                System.out.print("Paper beats Rock, Player 2 wins\n");
                player2count ++;
                System.out.print("player one score:" + player1count);
                System.out.print("\nplayer two score:" + player2count);
            }
            else if (player2.equalsIgnoreCase("S") && player1.equalsIgnoreCase("P")){

                System.out.print("Scissors beats Paper, Player 2 wins\n");
                player2count ++;
                System.out.print("player one score:" + player1count);
                System.out.print("\nplayer two score:" + player2count);
            }
            else if (player2.equalsIgnoreCase("R") && player1.equalsIgnoreCase("R")){

                System.out.print("Rock vs Rock, its a tie\n");

                System.out.print("player one score:" + player1count);
                System.out.print("\nplayer two score:" + player2count);
            }
            else if (player2.equalsIgnoreCase("P") && player1.equalsIgnoreCase("P")){

                System.out.print("Paper vs Paper, its a tie\n");
                System.out.print("player one score:" + player1count);
                System.out.print("\nplayer two score:" + player2count);
            }
            else if (player2.equalsIgnoreCase("S") && player1.equalsIgnoreCase("S")){

                System.out.print("Scissors vs Scissors, its a tie\n");
                System.out.print("player one score:" + player1count);
                System.out.print("\nplayer two score:" + player2count);
            }

            System.out.print("\ndo you want to keep playing?[Y,N]");
            playing = in.next();

            if (playing.equalsIgnoreCase("Y")){

                done = false;
            }
            else if (playing.equalsIgnoreCase("N")){
                System.out.print("thank you for playing!");
                done = true;

            }
        }
        while (!done);
    }
}
