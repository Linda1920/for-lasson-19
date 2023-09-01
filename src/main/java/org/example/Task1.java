package org.example;
import java.util.function.BooleanSupplier;
public class Task1 {
  @FunctionalInterface
    public interface MyBooleanSupplier {
         boolean getBoolean(int a);

    }

        public static void main(String[] args) {
            MyBooleanSupplier Obj1 = a -> a % 13==0;

            System.out.println("Result 1: " + Obj1.getBoolean(26));
            System.out.println("Result 2: " + Obj1.getBoolean(30));
            System.out.println("Result 3: " + Obj1.getBoolean(100));
        }}







