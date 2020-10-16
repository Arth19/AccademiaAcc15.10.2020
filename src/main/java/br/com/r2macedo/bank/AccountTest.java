package br.com.r2macedo.bank;

public class AccountTest {
    public static void main(String[] args) {
        Account a1 = new Account("Arthur");
        a1.deposit(1000);
        System.out.println("========================================================");
        System.out.println(a1.toString());
        a1.accountIncome();
        System.out.println("========================================================");
        System.out.println("Após um Income de 0,7% seu saldo é de: R$"+String.format("%.2f", a1.getAmount()));
        System.out.println("========================================================");
        a1.withdraw(388);
        System.out.println("Após um débito de R$388,00 seu saldo passa a ser de: R$"+ String.format("%.2f", a1.getAmount()));
    }
}
