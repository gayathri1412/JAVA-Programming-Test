/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dimagi;

import java.util.Scanner;

/**
 *
 * @author Gayathri
 */
public class NumberCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count = 0;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        String convert;
        for (int i = 1; i <= n; i++) {
            convert = Integer.toString(i);
            if (!(convert.contains("7"))) {
                count++;
            }

        }
        System.out.println("The count is: " + count);
    }

}
