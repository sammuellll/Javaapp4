
package javaapplication4;

import java.util.Scanner;

public class JavaApplication4 {

    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Boyunuzu giriniz (or: 1.73) = ");
        double boy = scanner.nextDouble();
       
        System.out.print("Kilonuzu giriniz = ");
        double kilo = scanner.nextDouble();
        
        double bki = kilo / (boy*boy);
        
        System.out.print("Boy kilo indexi = " + bki );
     
    }
    
}
