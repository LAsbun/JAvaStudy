/*
@author: sws
@software: IntelliJ IDEA
@file: InsufficientFundsException.java
@time: 3/14/18 4:54 PM
@desc:
*/

package exceptionTest;

public class InsufficientFundsException extends Exception {

    private double amount;

    public InsufficientFundsException(double amount){
        this.amount = amount;
    }

    public double getAmount(){
        return amount;
    }


    public static void main(String[] args) {

    }
}
