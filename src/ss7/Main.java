package ss7;

public class Main {
    public static void main(String[] args){
        Bank bank1 = new Bank(2000000, 12.5);
        double interest = bank1.calculateInterest(bank1.balance,bank1.rate);
        System.out.println("Số dư hiện tại của bạn là:" + interest);
    }
}