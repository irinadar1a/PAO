package examples.abs;

public class TestAbstractClass {
    public static void main(String[] args){
        //create Bank instance
//        Bank bank = new Bank();

        //create instances for ING and BCR
        INGBank ingBank = new INGBank();
        BCRBank bcrBank = new BCRBank();

        System.out.println("Ing gives me an interest of " + ingBank.getRateOfInterest());
        System.out.println("BCR gives me an interest of " + bcrBank.getRateOfInterest());
    }
}
