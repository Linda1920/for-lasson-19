package org.example;

public class Task3 {
    public static void main(String [] args){
    Operationable operation = (a,b,c)-> b * b - 4*a*c;
    double result=operation.calc(20.5,200.6, 18.3);

        System.out.println(result);}}
@FunctionalInterface
interface Operationable{
    double calc (double a, double b, double c); }
