import  java.util.Scanner;
import  java.util.*;
public class PrimeNumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter  number");
        int num=sc.nextInt();
        if(isPrime(num))
        {
            System.out.println(num+"is a prime number");
        }
        else
        {
            System.out.println(num+"is not prime number");
        }

    }
    public static boolean isPrime(int  num)
    {
        if(num<=1)
            return false;
        if(num==2 || num==3)
            return true;
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
                return false;
        }
        return true;
    }
    
    


    
}
