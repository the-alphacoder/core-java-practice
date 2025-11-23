/*
 * Arithmetic Operators in Java - Notes + Runnable Examples
 * This file contains short but deep explanations + example code.
 */

public class ArithmeticOperators {

    public static void main(String[] args) {

        // 1. Addition (+)
        // Used for numeric addition and string concatenation
        int a = 10 + 20; // 30
        String s = "Little" + "Master"; // String concatenation

        // 2. Subtraction (-)
        int b = 20 - 5; // 15

        // 3. Multiplication (*)
        int c = 7 * 6; // 42

        // 4. Division (/)
        // Integer division gives integer result
        int d = 10 / 3; // 3
        // For decimal results, use double
        double d2 = 10.0 / 3.0; // 3.333...

        // 5. Modulo (%) → remainder
        int e = 10 % 3; // 1

        // 6. Unary plus (+) and minus (-)
        int x = +10; // same as 10
        int y = -10; // negation

        // 7. Increment (++)
        int i = 5;
        int pre = ++i; // pre-increment: i becomes 6, pre = 6
        int post = i++; // post-increment: post = 6, i becomes 7

        // 8. Decrement (--)
        int j = 5;
        int preDec = --j; // pre-decrement
        int postDec = j--; // post-decrement

        // 9. Important behaviors
        // Division by zero (integer) → runtime error
        // Mod with negative numbers → result sign matches dividend
        int negMod = -10 % 3; // -1

        // 10. Operator precedence (high to low)
        // *, /, % have higher precedence
        // +, - are lower
        int result = 10 + 20 * 3; // 10 + 60 = 70

        // 11. Parentheses control precedence
        int result2 = (10 + 20) * 3; // 90

        // OUTPUT
        System.out.println("Addition: " + a);
        System.out.println("Concatination: " + s);
        System.out.println("Subtraction: " + b);
        System.out.println("Multiplication: " + c);
        System.out.println("Integer Division: " + d);
        System.out.println("Double Division: " + d2);
        System.out.println("Modulo: " + e);
        System.out.println("Unary Plus: " + x);
        System.out.println("Unary Minus: " + y);
        System.out.println("Pre Increment: " + pre);
        System.out.println("Post Increment: " + post);
        System.out.println("Pre Decrement: " + preDec);
        System.out.println("Post Decrement: " + postDec);
        System.out.println("Negative Modulo: " + negMod);
        System.out.println("Operator Precedence: " + result);
        System.out.println("Parentheses Result: " + result2);
    }
}
