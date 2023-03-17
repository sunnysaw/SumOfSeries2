/*
Question : Java Program to Find Sum of the Series 1/1! + 2/2! + 3/3! + ……1/N!
____________________________________________________________________________________
Test case :
1/1! + 2/2! + 3/3! + ..N/N!
Enter the no. of terms in series:5
Sum of series:2.708333333333333
 */
import java.util.Scanner;
public class Main {
     double factorial(double digit){
        double multiple = 1;
        while (digit > 0){
            multiple *= digit;
            digit--;
        }
        return multiple;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double digit,sum = 0;
        int temp = 1;
        System.out.println("Enter the ending digit :");
        digit = sc.nextDouble();
        Main obj = new Main();
        while (temp <= digit){
            sum += temp / (obj.factorial(temp));
            temp++;
        }
        System.out.println("Printing the result : " + sum);
    }
}