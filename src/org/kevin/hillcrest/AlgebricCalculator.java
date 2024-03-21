package org.kevin.hillcrest;

import java.util.Scanner;
import java.util.Stack;

public class AlgebricCalculator {
    public static void main(String[] args) {
        /*
            if value is a number
                push on number stack
            else if value is (
                push on operator stack
            else if we have an operator
                while the top of the operator stack has a higher precedence than the operator
                    evaluate the top
                push operator on the stack
            else if value is )
                while top of stack is not (
                    evaluate the top
                pop ( off the stack
            else if no more input
                while operator stack is not empty
                    evaluate top
         */
        var in = new Scanner(System.in);
        var numberStack = new Stack<Integer>();
        var operatorStack = new Stack<String>();
        System.out.println("Enter an algebraic expression with spaces as seperators");
        while(in.hasNext()){
            var input = in.next(); //grabs next token
            if ()
        }

    }
}
