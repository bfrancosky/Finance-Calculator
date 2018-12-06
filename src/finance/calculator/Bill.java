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
public class Bill extends Account {
    String name = "";
    Double bill_interest_rate = 0.0;
    
    public Bill() {
        super.account_name = "";
        super.account_balance = 0.0;
    }
    
    public Bill(Double interest_rate) {
        this.bill_interest_rate = interest_rate;
    }
    
    public Bill(String name, Double amount) {
        super.account_name = name;
        super.account_balance = amount;
    }
    
}
