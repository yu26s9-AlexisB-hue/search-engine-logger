package com.pluralsight;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args){

        try {
            FileWriter writer = new FileWriter("logs.txt", true);
            LocalDateTime today = LocalDateTime.now();

            DateTimeFormatter num1 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
            String SlashDate = today.format(num1) + " launch \n";
            writer.write(SlashDate);

            Scanner scanner = new Scanner(System.in);
            String input;
            do{
                //Prompting the user
                System.out.print("Enter a search term (X to exit):  ");
                input = scanner.nextLine();

                if(!input.equalsIgnoreCase("X")){
                    String answer = formatSearchLogString(input);
                    writer.write(answer);
                }



            } while(!input.equalsIgnoreCase("x"));
            //we are out of the loop, , log the exit!
            DateTimeFormatter num3 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
            String SlashDate3 = today.format(num3) + " Exit \n";
            writer.write(SlashDate3);




            writer.close();

        } catch (Exception e) {
            System.out.print(e.getMessage());
        }




    }
    private static @NotNull String formatSearchLogString(String searchTerm){
        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter num = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        String SlashDate1 = today.format(num);

        return SlashDate1 + " Search: " + searchTerm + "\n";

    }
}
