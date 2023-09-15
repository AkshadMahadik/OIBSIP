/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ATM;

/**
 *
 * @author Akshad
 */
public class Transactions {
    int Balance = 10000;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public int Deposit (int DepositAmount){
         Balance=Balance+DepositAmount;
        return Balance;
    }
    public int Withdraw (int WithdrawAmount){
         Balance=Balance-WithdrawAmount;
        return Balance;
    }
    public int Transfer (int TransferAmount){
         Balance=Balance-TransferAmount;
        return Balance;
    }
    
}
