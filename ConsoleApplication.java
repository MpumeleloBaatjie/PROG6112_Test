 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.consoleapplication;

/**
 *
 * @author Student
 */
import java.util.*;

public class ConsoleApplication {

    public static void main(String[] args) {
         System.out.println("Select a beverage type\n1) PS5\n2) XBOX \n3) SWITCH");
         Scanner scan = new Scanner(System.in);
        
         System.out.print("Select option (1-3): ");
         int option = scan.nextInt();
         
         if (option == 1 || option ==2 || option ==3){
             System.out.print("Enter the store: ");
             String storeName = scan.nextLine();
            }
             System.out.print("Enter the store: ");
             String storeName = scan.nextLine();
             
             Console con = new Console("DGVGG", "fghg", 33);
        
    }
}
