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

public class carpimTablosu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "lerin çarpımı:");
            for (int j = 1; j <= 10; j++) {
                int sonuc = i * j;
                System.out.println(i + "*" + j + "*" + sonuc);

            }

        }
    }

}
