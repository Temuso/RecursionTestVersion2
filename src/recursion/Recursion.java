/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursion;

/**
 *
 * @author MAKHURANET
 */
public class Recursion {
    
    public static int fact(int n) {
        if (n == 0 || n == 1) 
            return 1;
        else
            return n * fact(n - 1);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("This is fun" + fact(5));   
    }
    
}
