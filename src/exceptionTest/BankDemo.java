/*
@author: sws
@software: IntelliJ IDEA
@file: BankDemo.java
@time: 3/14/18 5:02 PM
@desc:
*/

package exceptionTest;

public class BankDemo {

    public static void main(String[] args) {
        CheckingAccount c = new CheckingAccount(101);
        System.out.println("Depositing .. 500");
        c.deposit(500);
        try {
            System.out.println("\n WithDrawing 100...");
            c.withdraw(100);
            System.out.println("\n WithDrawing 600");
            c.withdraw(600);
        } catch (InsufficientFundsException e) {
            System.out.println("sor " + e.getAmount());
            e.printStackTrace();
        }
    }
}
