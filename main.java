package com.atharv;
import java.util.Scanner;
import java.util.Random;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int value = rand.nextInt(3);
        System.out.println("1 = Rock \n 2 = Paper\n 3 = Scissor");
        System.out.print("Enter Your Digit: ");
        int user_input = sc.nextInt();
        System.out.println("Computer choose: " + value );
        if (value == 1 && user_input == 1){
            System.out.println("Tie");
        }
        else if (value == 1 && user_input == 2) {
            System.out.println("Congratulations, You Win");
        }
        else if (value == 1 && user_input == 3) {
            System.out.println("You lose, Better luck next time");
        }

        else if (value == 2 && user_input == 1) {
            System.out.println("You lose, Better luck next time");
        }
        else if (value == 2 && user_input == 2) {
            System.out.println("Tie");
        }
        else if (value == 2 && user_input == 3) {
            System.out.println("Congratulations, You Win");
        }

        else if (value == 3 && user_input == 1) {
            System.out.println("Congratulations, You Win");
        }
        else if (value == 3 && user_input == 2) {
            System.out.println("You lose, Better luck next time");
        }
        else if (value == 3 && user_input == 3) {
            System.out.println("Tie");
        }
        System.out.println("Thank You For Playing");
    }
}
