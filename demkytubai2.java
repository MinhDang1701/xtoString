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
public class demkytubai2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int dem = 1;
        for(int i=0;i<n.length();i++){
           if( n.charAt(i)==' ') {
               dem++;
        }
        }
        System.out.println("KQ: "+dem);
}
}


