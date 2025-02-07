/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package string;
  import java.util.Scanner;
/**
 *
 * @author ThinkPad
 */
public class trichxuatSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        String input = scanner.nextLine();
        extractNumbers(input);
        scanner.close();
    }

    public static void extractNumbers(String str) {
        StringBuilder number = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                number.append(c);
            } else {
                if (number.length() > 0) {
                    System.out.print(number.toString() + " ");
                    number.setLength(0); 
                }
            }
        }
    
        if (number.length() > 0) {
            System.out.print(number.toString() + " ");
        }
    }
}
 

