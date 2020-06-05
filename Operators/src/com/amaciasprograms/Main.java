package com.amaciasprograms;

public class Main {

    public static void main(String[] args) {
        /* The following has is an example:
        *
        * int mySalary = hourlyWage * hoursWorked;
        *
        * Everything on the right side of the `=` is considered an Expression.
        * The operands of this expression are hourlyWage and hoursWorked. The operator is `*`.
        * Expressions are made up of operands and operators.
        */

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        System.out.println("previousResult = " + previousResult);

        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10;
        System.out.println("2 * 10 = " + result);

        result = result / 5;
        System.out.println("20 / 5 = " + result);

        result = result % 3;
        System.out.println("4 / 3 = " + result);

        // result = result + 1 can be abbreviated.
        result++;
        System.out.println("1 + 1 = " + result);

        result--;
        System.out.println("2 - 1 = " + result);

        result += 2;
        System.out.println("1 + 2 = " + result);

        result *= 10;
        System.out.println("3 * 10 = " + result);

        result /= 3;
        System.out.println("30 / 3 = " + result);

        result -= 2;
        System.out.println("10 - 2 = " + result);

    }
}
