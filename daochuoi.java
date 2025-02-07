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
public class daochuoi {
     public static void main(String[] args) {
        // TODO code application logic here
    
         Scanner scanner=new Scanner(System.in);
        String s1=scanner.nextLine();
       StringBuffer kq=new StringBuffer(s1);
       kq.reverse();
         System.out.println("KQ: "+kq);
       
}}
