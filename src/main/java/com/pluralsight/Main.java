package com.pluralsight;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args){

        try {
            BufferedReader reader = new BufferedReader(new FileReader("logs.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("logs.txt"));

            Scanner scanner = new Scanner(System.in);
            String input;

            //Prompting the user
            System.out.print("Enter a search term (X to exit): ");
            input = scanner.nextLine();


        } catch (Exception e) {
            System.out.print(e.getMessage());
        }





    }

    private void  search(){
        System.out.print("Searching");
    }

    private void  launch(){
        System.out.print("Searching");
    }

    private void  exit(){
        System.out.print("Searching");
    }
}
