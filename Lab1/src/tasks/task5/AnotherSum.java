package tasks.task5;

import java.util.Scanner;


public class AnotherSum {
    public static void main(String args[]){
        String s1 = "1236128736182736128637812";
        String s2 = "123612873618273612863781212323234";

        Integer l1 = s1.length();
        Integer l2 = s2.length();
        Integer maxLenght = 0;
        Integer diff = Math.abs(l1 - l2);
        StringBuilder pad = new StringBuilder();
        while (diff > 0) {
            pad.append("0");
            diff--;
        }
        System.out.println(pad);
        StringBuilder sb1;
        StringBuilder sb2;
        if (l1 < l2) {
            sb1 = new StringBuilder(pad);
            sb1.append(s1);
            sb2 = new StringBuilder(s2);
            maxLenght = l2;
        } else {
            sb2 = new StringBuilder(pad);
            sb2.append(s2);
            sb1 = new StringBuilder(s1);
            maxLenght = l1;
        }

        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(maxLenght);
//        System.out.println(sb1.charAt(32));
        StringBuilder sTotal = new StringBuilder();
        Integer carry = 0;

        for (int i = maxLenght - 1; i >= 0; i--) {
            Integer tempSum;
            tempSum = Integer.parseInt(String.valueOf(sb1.charAt(i))) + Integer.parseInt(String.valueOf(sb2.charAt(i))) + carry;
            if (tempSum <= 9) {
                sTotal.insert(0, tempSum);
                carry = 0;
            } else {
                sTotal.insert(0, (tempSum - 10));
                carry = 1;
            }
        }

        System.out.println("The total sum !!!!!");
        System.out.println(sTotal);
    }
}
