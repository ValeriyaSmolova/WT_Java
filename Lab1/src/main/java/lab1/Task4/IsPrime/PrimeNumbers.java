package main.java.lab1.Task4.IsPrime;

import java.math.BigInteger;

public class PrimeNumbers {
    
    int[] arr;

    public PrimeNumbers(int N){
        arr = new int[N];
        for (int i = 0; i < N; ++i){
            arr[i]= (int)Math.round(Math.random()*100);
            System.out.printf("a[%d] = %d  \r\n", i, arr[i]);
        }
        
    }

    public void getResult (){
        for (int i =0; i< arr.length; i++) {
            BigInteger bigInt = BigInteger.valueOf(arr[i]);
            boolean isPrime = bigInt.isProbablePrime((int) Math.log(arr[i]));
            if(isPrime)
                System.out.printf("Prime number: \r\n arr[%d] = %d \r\n", i,  arr[i] );
        }
    }
}