package com.company;

public class fibonacciSequence
{
    public static void main(String[] args)
    {
        int initialValue = 0, secondValue = 0, newValue = 1, sumFibonacci = 0;

        while (sumFibonacci < 4000000)
        {
            initialValue = secondValue;
            secondValue = newValue;
            newValue = initialValue + secondValue;

            if (newValue % 2 == 0)
            {
                sumFibonacci += newValue;
            }
        }
        System.out.println(sumFibonacci);
    }
}