/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dimagi;

import java.util.*;
/**
 *
 * @author Gayathri
 */
public class StringRotation {

    public static String Rotate(String s) {
        // TODO code application logic here
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'm') {
                c += 13;
            } else if (c >= 'A' && c <= 'M') {
                c += 13;
            } else if (c >= 'n' && c <= 'z') {
                c -= 13;
            } else if (c >= 'N' && c <= 'Z') {
                c -= 13;
            }
            sb.append(c);
        }
        return sb.toString();
    }
    
    public static void main(String args[]) {
     
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a new string: ");
        String line = sc.nextLine();
        String output = Rotate(line);
        System.out.println("The rotated string is: " + output);
        
    }
}
