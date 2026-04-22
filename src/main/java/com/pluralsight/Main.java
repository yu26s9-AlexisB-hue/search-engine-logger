package com.pluralsight;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args){

        try {
            BufferedReader reader = new BufferedReader(new FileReader("logs.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("logs.txt", true));

            Scanner scanner = new Scanner(System.in);
            String input;
            do{
                LocalDateTime today = LocalDateTime.now();

                DateTimeFormatter num1 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
                String SlashDate = today.format(num1) + " launch";
                writer.write(SlashDate);


                //Prompting the user
                System.out.print("Enter a search term (X to exit): ");
                input = scanner.nextLine();

                if (!input.trim().isEmpty()){
                    DateTimeFormatter num = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
                    String SlashDate1 = today.format(num) + " search : ";
                    String searched = SlashDate1 + input;
                    writer.write(searched);

                } else{
                    DateTimeFormatter num2 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
                    String SlashDate3 = today.format(num2) + " exit";
                    String exit = SlashDate3 + input;

                    writer.write(exit);
                }

            } while(!input.equals("x"));


        } catch (Exception e) {
            System.out.print(e.getMessage());
        }





    }
}
