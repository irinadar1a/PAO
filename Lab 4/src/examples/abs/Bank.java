package examples.abs;

public abstract class Bank {
    protected static int availableDeposit = 0;

    public static int getAvailableDeposit() {
        return availableDeposit;
    }

    public void deposit(int sum){
        availableDeposit += sum;
    }

    public abstract int getRateOfInterest();

}
