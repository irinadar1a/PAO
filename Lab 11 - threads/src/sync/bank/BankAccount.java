package sync.bank;

public class BankAccount {
    private int totalAmount;

    public BankAccount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int checkBalance() {
        System.out.println("Total balance: " + totalAmount);
        return totalAmount;
    }

    public void extract(int sum) {
        if (sum > totalAmount) {
            System.out.println("Insufficient funds!");
        } else {
            totalAmount -= sum;
            System.out.println("Remaining balance : " + totalAmount);
        }
    }
}
