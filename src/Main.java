package src;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Main {
   public static void main(String[] args) {
      final String PATH = "C:/Users/Adib Zaini/Desktop/CS230 PART 3/CSC483/Project/app/database/staff.csv";

      try {
         Scanner reader = new Scanner(new File(PATH));

         while(reader.hasNextLine()) {
            String[] line = reader.nextLine().split(",");
            if (line[1].equals("staff_name")) continue;
            System.out.println("Name: " + line[1]);
         }
         reader.close();
      } catch (IOException e) {
         System.out.println("An error occured");
         e.printStackTrace();
      }
   }
}
