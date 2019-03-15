package tasks.task1;


public class Task1 {
    public static void main(String args[]){
        System.out.println("This is the first task main class");
        System.out.println("2 + 5 = " + calculateSum(2,5));
        System.out.println("10 + 20 = " + calculateSum(10,20));
    }

    public static int calculateSum(int a, int b){
        return a + b;
    }
}
