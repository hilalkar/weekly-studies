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

public class kare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int row;
        do {
            System.out.println("lütfen satır sayısını giriniz:");
            row = input.nextInt();
        } while (row < 0 || row % 2 == 0);
        int col = row;
        for (int i = 1; i <= row; i++) {
            if (i == 1 || i == row) {
                for (int j = 1; j <= row; j++) {
                    System.out.print("*");

                }
            } else {
                for (int j = 1; j <= col; j++) {
                    if (j == 1 || j == col) {
                        System.out.print("*");

                    } else {
                        System.out.print(" ");
                    }

                }
            }
            System.out.println("");

        }

    }}
