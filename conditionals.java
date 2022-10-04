package com.company;
import java.util.Scanner;
import java.util.Random;
public class conditionals {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("Welcome to the Rock,Paper,Scissors game");
        int rand1 = rand.nextInt(3);
        Scanner sc = new Scanner(System.in);
        System.out.println("Rock for 0\nPaper for 1\nSissor for 2");
        System.out.print("Enter your number:-");
        int x = sc.nextInt();
        if(x==rand1){
            System.out.println("Match will be tie");
            System.out.println("Try again");
        }
        else if(x==0&&rand1==1){
            System.out.println("You lost the game");
            System.out.println("Try again");
        }
        else if(x==0&&rand1==2){
            System.out.println("You win the game");
            System.out.println("Congrats");
        }
        else if(x==1&&rand1==0){
            System.out.println("You win the game");
            System.out.println("Congrats");
        }
        else if(x==1&&rand1==2){
            System.out.println("You lost the game");
            System.out.println("Try again");
        }
        else if(x==2&&rand1==0){
            System.out.println("You lost the game");
            System.out.println("Try again");
        }
        else if(x==2&&rand1==1){
            System.out.println("You win the game");
            System.out.println("Congrats");
        }
        else{
            System.out.println("Sorry see you soon !");
        }
    }
}






















