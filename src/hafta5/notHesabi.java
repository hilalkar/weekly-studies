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

public class notHesabi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int vizeNot;
        int finallNot;
        double ortalama;
        do {
            System.out.println("vizenot: ");
            vizeNot = input.nextInt();
            System.out.println("finallnot: ");
            finallNot = input.nextInt();

        } while (vizeNot < 0 || vizeNot > 100 && finallNot < 0 || finallNot > 100);
        ortalama = vizeNot * 0.4 + finallNot * .6;
        System.out.println("ortalama : " + ortalama);

        if (ortalama >= 80 && ortalama <= 100) {
            System.out.println("not A");

        } else if (ortalama >= 60 &&  ortalama <= 79) {
            System.out.println("not B");
        } else if (ortalama >= 50 && ortalama <= 59) {
            System.out.println("not C");
        } else {
            System.out.println(" not D");
        }

    }

}
