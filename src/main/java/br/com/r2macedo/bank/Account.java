package br.com.r2macedo.bank;

import java.util.Random;

public class Account {

    private int num;
    private double amount;
    private String name;

    public Account(String name){
        this.name = name;
        Random random = new Random();
        this.num = random.nextInt(999999);
    }

    void deposit(double depositAmount){
        this.amount += depositAmount;
    }

    void withdraw(double withDrawAmount){
        this.amount -= withDrawAmount;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void accountIncome(){
        this.setAmount(this.amount * 1.07);
    }

    @Override
    public String toString() {
        return "Nome:" + name +
                "\nNº da conta: " + num +
                "\nValor em conta: R$" + amount;
    }
}
