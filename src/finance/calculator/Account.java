/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finance.calculator;

/**
 *
 * @author Brian
 */
abstract class Account {
    String account_name;
    Double account_balance;
    
    /*
    public Account() {
        account_name = "";
        account_balance = 0.0; 
    }
    
    public Account(String name, Double balance) {
        this.account_name = name;
        this.account_balance = balance;
    }
    */
    
    public void setAccountName(String name) {
        this.account_name = name;
    }
    
    public String getAccountName() {
        return account_name;
    }
    
    public void setAccountBalance(Double balance) {
        this.account_balance = balance;
    }
    
    public Double getAccountBalance() {
        return account_balance;
    }
    
}
