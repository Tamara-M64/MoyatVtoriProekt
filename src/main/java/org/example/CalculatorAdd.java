package org.example;

public class CalculatorAdd {
    public static void main(String[] args) {
        Calculator obj=new Calculator();
        System.out.println("Събиране: " + obj.add(3, 2));
        System.out.println("Деление: " + obj.divide(4, 2));
        System.out.println("Умножение: " + obj.multiply(4, 2));
        System.out.println("Изваждане: " + obj.subtract(10, 5));
    }

}
