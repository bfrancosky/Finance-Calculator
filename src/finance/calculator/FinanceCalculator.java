/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finance.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Brian
 */
public class FinanceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Account name: ");
        String name = br.readLine();
        System.out.println("Amount paid: ");
        Double amount = scan.nextDouble();
        
        Bill newBill = new Bill(name, amount);
        
        System.out.println(newBill.getAccountName() + "(-" + newBill.getAccountBalance() + ") added");
        
        
        
    }
    
}
