/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtostring;
 import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class demsolanxuathien {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
          System.out.println("KY TU CAN DEM: ");
        char kytu=scanner.nextLine().charAt(0);
        int dem=0;
         for(int i=0;i<n.length();i++){
           if( n.charAt(i)==kytu) {
               dem++;
        }
        }
        System.out.println("KQ: "+dem);
        
        
      }
}

