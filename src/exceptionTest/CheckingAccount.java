/*
@author: sws
@software: IntelliJ IDEA
@file: CheckingAccount.java
@time: 3/14/18 4:55 PM
@desc:
*/

package exceptionTest;

public class CheckingAccount {

    private double balance;
    private int number;

    public CheckingAccount(int number) {
        this.number = number;
    }

    // 存钱
    public void deposit(double amount) {
        balance += amount;
    }

    // 取钱
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= balance) {
            balance -= amount;
        } else {
            double needs = amount - balance;
            throw new InsufficientFundsException(needs);
        }
    }

    // 获取余额
    public double getBalance() {
        return balance;
    }

    // 返回卡号
    public int getNumber() {
        return number;
    }

    public static void main(String[] args) {

    }
}
