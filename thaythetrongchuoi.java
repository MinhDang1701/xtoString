
import java.util.Scanner;


public class thaythetrongchuoi {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
         System.out.println("Nhap tu thay the: ");
         String x=scanner.nextLine();
         String newString = n.replace(n,x);
        System.out.println("Chuoi moi:"+newString);
     }
}


