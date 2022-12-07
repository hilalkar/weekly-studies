 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hafta5;

/**
 *
 * @author HİLAL
 */
import java.util.Scanner;
public class Hafta5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int sayi ;
        do{
            System.out.print("Lütfen bir tam sayı giriniz: ");
            sayi =input.nextInt();
              
        } while (sayi >100 || sayi<1);
        System.out.println("" + sayi);
        
        
                
       
        
            
        
    }
    
}
