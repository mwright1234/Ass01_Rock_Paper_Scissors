
import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String player1;
        String player2;
        boolean valid = false;
        boolean done = false;
        do {
            do {
                System.out.print("what is player 1s move[R, P, S]:");
                player1 = in.next();
                if (player1.equalsIgnoreCase("R") || player1.equalsIgnoreCase("S") || player1.equalsIgnoreCase("P")) {
                    valid = true;


                } else {

                    System.out.print("you did not enter the correct input");
                    in.next();
                }

            }
            while (!valid);
            do {
                System.out.print("what is player 2s move[R, P, S]:");
                player2 = in.next();
                if (player2.equalsIgnoreCase("R") || player2.equalsIgnoreCase("S") || player2.equalsIgnoreCase("P")) {
                    valid = true;


                } else {

                    System.out.print("you did not enter the correct input");
                    in.next();
                }


            }
            while (!valid);

            if (player1.equalsIgnoreCase("R") && player2.equalsIgnoreCase("S") || player1.equalsIgnoreCase("P"))










        }
        while (!done);
    }
}
