package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        calc.println.accept(a);
        int b = calc.minus.apply(1,1);
        calc.println.accept(b);
        int c = calc.devide.apply(a, b);// необходимо избежать деления на 0
        calc.println.accept(c);
        int d = calc.abs.apply(-23);
        calc.println.accept(d);
        int e = calc.pow.apply(54);
        calc.println.accept(e);
        int f = calc.multiply.apply(54, 34);
        calc.println.accept(f);

    }
}
