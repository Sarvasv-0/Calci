/* 
 *  @Creator: Sarvasv-0
 *  
 *  @Date: 11/05/2023 7:19 AM IST
 * 
 *  @Version: 1.5 Java (Method Version)
 */

/*
Copyright (c) 2023, Sarvasv-0
All rights reserved.

This source code is licensed under the BSD-style license found in the
LICENSE file in the root directory of this source tree.
*/
import java.util.Scanner;
public class Calci{
    static long multiply(int a, int b){
        int x = a*b;
        System.out.print("Your Answer is: ");
        return x;
    }
    static float division(float a, float b){
        float x =(float) a/b;
        System.out.print("Your Answer is: ");
        return x;
    }
    static int subtract(int a, int b){
        int x = a-b;
        System.out.print("Your Answer is: ");
        return x;
    }
    static int addition(int a,int b){
        int x = a+b;
        System.out.print("Your Answer is: ");
        return x;
    }
    public static void main(String[] args) {
        System.out.println("Calci Basic Calculator");
        System.out.println();
        System.out.println("Enter \'+\' for addition\nEnter \'-\' for subtraction\nEnter \'X\' OR \'x\' \'*\' for Multiplication\nEnter \'/\' for Division");
        System.out.println();
        System.out.println("Which Operation do you want to do?");
        Scanner sc = new Scanner(System.in);
        String operater = sc.next();
        String op = operater.toLowerCase();
        if(op=="+"){
            System.out.println("Enter the Numbers you want to add");
            System.out.print("Number 1: ");
            int x = sc.nextInt();
            System.out.print("Number 2: ");
            int y = sc.nextInt();
            addition(x,y);
        }
        else if(op=="-"){
            System.out.println("Enter the Numbers you want to subtract");
            System.out.print("Number 1: ");
            int x = sc.nextInt();
            System.out.print("Number 2: ");
            int y = sc.nextInt();
            subtract(x, y);
        }
        else if(op=="/"){
            System.out.println("Enter the Numbers you want to divide");
            System.out.print("Number 1: ");
            Float x = sc.nextFloat();
            System.out.print("Number 2: ");
            Float y = sc.nextFloat();
            division(x, y);
        }
        else if(op=="x"){
            System.out.println("Enter the Numbers you want to Multiply");
            System.out.print("Number 1: ");
            int x = sc.nextInt();
            System.out.print("Number 2: ");
            int y = sc.nextInt();
            multiply(x, y);
        }
        else if(op=="*"){
            System.out.println("Enter the Numbers you want to Multiply");
            System.out.print("Number 1: ");
            int x = sc.nextInt();
            System.out.print("Number 2: ");
            int y = sc.nextInt();
            multiply(x, y);
        }
        else{
            System.out.println("Invalid Input!");
        }
        sc.close();
    }
}