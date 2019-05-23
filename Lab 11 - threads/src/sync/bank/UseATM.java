package sync.bank;

public class UseATM implements Runnable {
    private BankAccount bankAccount;
    private String name;

    public UseATM(BankAccount bankAccount, String name) {
        this.bankAccount = bankAccount;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Hi " + name);
        int balance = bankAccount.checkBalance();

        if (balance > 50) {
            System.out.println("you can extract 50 " + name);
            bankAccount.extract(50);
        } else {
            System.out.println("Not enough money :( " + name);
        }
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(90);

        Thread marry = new Thread(new UseATM(bankAccount, "Marry"));
        Thread john = new Thread(new UseATM(bankAccount, "John"));

        marry.start();
        john.start();
    }
}
