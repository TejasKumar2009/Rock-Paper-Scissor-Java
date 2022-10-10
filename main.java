import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("********** ROCK PAPAER SCISSOR GAME MADE BY TEJAS KUMAR **********");

        // Variables
        int min = 1;
        int max = 3;

        // User's Choice
        System.out.print("What's Your Choice For Rock Press (R) For Paper Press (P) For Scissor Press (S) : ");
        char user_choice = sc.next().toLowerCase().charAt(0);
        if (user_choice != 'r' && user_choice != 'p' && user_choice != 's') {
            System.out.println("You Entered Wrong Character. Please Rry Again !");
            System.exit(0);
        }

        // Computer's Choice
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        char comp_choice = 'a';
        if (random_int == 1) {
            comp_choice = 'r';
        }
        else if (random_int == 2) {
            comp_choice = 'p';
        }
        else if (random_int == 3) {
            comp_choice = 's';
        }

        // Comparing the Actions & Declaring Winner
        System.out.println("Your Choice : " + user_choice);
        System.out.println("Computer Choice : " + comp_choice);

        if (user_choice=='r' && comp_choice=='p' || user_choice=='p' && comp_choice=='s' || user_choice=='s' && comp_choice=='r' ) {
            System.out.println("Computer Won The Game! Better Luck Next Time :(");
        }
        else if (comp_choice=='r' && user_choice=='p' || comp_choice=='p' && user_choice=='s' || comp_choice=='s' && user_choice=='r' ) {
            System.out.println("Congratulations! You won the Game :)");
        }
        else {
            System.out.println("Ohh! It's a Tie! Nobody won This Match :|");
        }

    }
}
