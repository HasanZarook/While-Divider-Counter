package lab1;

import java.util.Scanner;
public class WhileDivided_lab1_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the integer number : ");
        int n = input.nextInt();
        if(n>0) {
            int i = 1;
            while (n > 1) {
                n = n / 2;
                i++;
            }
            System.out.println("We can divide the n " +i+ " times");
        }
        else
        {
            System.out.println("Illegal input !!! , Enter the positive number");
        }

    }
}
