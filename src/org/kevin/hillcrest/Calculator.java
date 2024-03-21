package org.kevin.hillcrest;

import java.util.Scanner;
import java.util.Stack;

public class Calculator {

    public static void main(String[] args) {
       /*
            If I read a number
                push number on the stack
            Else if I read an operator
                Pop two values off the stack
                combine the values with the operand
                push answer back on the stack
            Else if there is no more input
                Pop result and display
        */
        var in = new Scanner(System.in);
        var stack = new Stack<Integer>();
        System.out.println("Enter one number or operator per line or Q to quit");
        boolean done = false;
        while(!done){
            var input = in.nextLine();
            if(input.equalsIgnoreCase("q")){
                done=true;
            } else if (input.equals("+")) {
                var first = stack.pop();//removes the top number
                var second = stack.pop();//removes the top number
                var result = first + second;
                stack.push(result);
            } else if (input.equals("-")){
                var first = stack.pop();//removes the top number
                var second = stack.pop();//removes the top number
                var result = first - second;
                stack.push(result);
            } else if (input.equals("*")||input.equalsIgnoreCase("x")){
                var first = stack.pop();//removes the top number
                var second = stack.pop();//removes the top number
                var result = first * second;
                stack.push(result);
            } else if (input.equals("/")){
                var first = stack.pop();//removes the top number
                var second = stack.pop();//removes the top number
                var result = first/second;
                stack.push(result);
            } else {
                var value = Integer.parseInt(input);
                stack.push(value);
            }
        }
        System.out.println(stack.pop());
    }
}
