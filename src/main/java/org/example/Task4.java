package org.example;
import java.lang.Math;
public class Task4 extends Task3{
    public static void main(String[] args) {
        Operationable operation = (a ,b,c) -> a*Math.pow(b,c);
        double result= operation.calc(20,30.1,2.5);
        double result2= operation.calc(20,3,3);
        System.out.println(result);
        System.out.println(result2);
}}
