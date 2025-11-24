/*
 * File: JavaConditionalsGuide.java
 * Title: How to Use Conditional Statements in Java
 * Covers: if, else-if, else, switch-case, relational operators, logical operators
 * Runnable + explainer comments
 */

public class JavaConditionalsGuide {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        // -------------------------------------------------------------
        // RELATIONAL OPERATORS
        // -------------------------------------------------------------
        // >  greater than
        // <  less than
        // >= greater than or equal to
        // <= less than or equal to
        // == equal to (value compare)
        // != not equal to

        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        // -------------------------------------------------------------
        // LOGICAL OPERATORS
        // -------------------------------------------------------------
        // &&  AND → true only if both are true
        // ||  OR  → true if at least one is true
        // !   NOT → reverses boolean value

        boolean x = true;
        boolean y = false;

        System.out.println("x && y: " + (x && y));  // false
        System.out.println("x || y: " + (x || y));  // true
        System.out.println("!x: " + (!x));           // false

        // -------------------------------------------------------------
        // IF STATEMENT
        // -------------------------------------------------------------
        // Used when you want to check a condition and run code only if true

        if (a < b) {
            System.out.println("IF: a is less than b");
        }

        // -------------------------------------------------------------
        // IF - ELSE
        // -------------------------------------------------------------
        // If the first condition is false, else executes

        if (a > b) {
            System.out.println("a is greater");
        } else {
            System.out.println("ELSE: a is NOT greater than b");
        }

        // -------------------------------------------------------------
        // IF - ELSE IF - ELSE
        // -------------------------------------------------------------
        // Use when multiple conditions need to be checked in order

        int marks = 72;

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 60) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }

        // -------------------------------------------------------------
        // SWITCH CASE
        // -------------------------------------------------------------
        // Used when checking one variable for multiple fixed values
        // Cleaner than writing long else-if chains
        // break prevents fall-through (execution of next cases)

        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("Invalid day");
        }

        // -------------------------------------------------------------
        // ENHANCED SWITCH (Java 14+)
        // -------------------------------------------------------------

        String result = switch (day) {
            case 1 -> "Mon";
            case 2 -> "Tue";
            case 3 -> "Wed";
            default -> "Unknown";
        };
        System.out.println("Enhanced switch: " + result);

        // -------------------------------------------------------------
        // NESTED CONDITIONS (avoid unless needed)
        // -------------------------------------------------------------
        int age = 22;
        boolean hasID = true;

        if (age >= 18) {
            if (hasID) {
                System.out.println("Access granted");
            } else {
                System.out.println("ID required");
            }
        } else {
            System.out.println("Underage");
        }

        // -------------------------------------------------------------
        // IMPORTANT RULES SUMMARY
        // -------------------------------------------------------------
        System.out.println("\nSUMMARY:");
        System.out.println("Relational operators compare values (>, <, ==, != etc.)");
        System.out.println("Logical operators combine conditions (&&, ||, !)");
        System.out.println("Use if-else for normal decision making");
        System.out.println("Use else-if when multiple conditions exist");
        System.out.println("Use switch when same variable is checked for many fixed cases");
        System.out.println("Enhanced switch is cleaner (Java 14+)");
    }
}
