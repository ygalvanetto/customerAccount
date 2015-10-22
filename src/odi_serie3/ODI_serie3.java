/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odi_serie3;

import business.Customer;

/**
 *
 * @author luc.chevre
 */
public class ODI_serie3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Customer c1 = new Customer(1,"luc" ,"chevre");
        
        c1.addAccount("123", "epargne", 0.1);
        c1.getAccountByNumber("123").credit(100);
        c1.getAccountByNumber("123").debit(150);
        
    }
    
}
