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
public class sayibulma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input =new Scanner(System.in);
       int BS , tahmin, s=0;
       BS = (int) (Math.random() *98)+1;
       do{
       System.out.print("tahminimiz: ");
       tahmin = input.nextInt();
       s++;
       if(tahmin>BS)
           System.out.println("daha küçük sayı giriniz..");
       if(tahmin<BS)
           System.out.println("daha büyük sayı giriniz..");
       System.out.println("");
       }while(tahmin!=BS);
       System.out.println(s+"tahminde buldunuz...");
    }}
       
     
    
    

