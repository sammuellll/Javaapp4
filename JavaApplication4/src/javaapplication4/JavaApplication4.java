
package javaapplication4;

import java.util.Scanner;

public class JavaApplication4 {

    public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Boyunuzu giriniz (or: 1.73) ");
        double boy = scanner.nextDouble();
       
        System.out.println("Kilonuzu giriniz  ");
        double kilo = scanner.nextDouble();
        
        double bki = kilo / (boy*boy);
        
        System.out.println("Boy kilo indexi =  " + bki );
        
        
        
        
    }
    
}
