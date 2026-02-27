package test2.q14;

class Calculator {
    // TODO: 두 개의 int를 더하는 add 메서드를 작성하시오.
    public int intAdd(int num1, int num2) {
        return num1 + num2;
    }
    // TODO: 두 개의 double을 더하는 add 메서드를 작성하시오.
    public double doubleAdd(double num1, double num2) {
        return num1 + num2;
    }
}

public class OverloadingCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // TODO: 5와 10을 더한 결과를 "정수 덧셈 결과: [결과]" 형식으로 출력하시오.
        System.out.println("정수 덧셈 결과: " + calc.intAdd(5, 10));
        // TODO: 3.5와 2.5를 더한 결과를 "실수 덧셈 결과: [결과]" 형식으로 출력하시오.
        System.out.println("실수 덧셈 결과: " + calc.doubleAdd(3.5, 2.5));
    }
}