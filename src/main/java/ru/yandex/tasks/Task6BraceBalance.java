package ru.yandex.tasks;

import java.util.Stack;

public class Task6BraceBalance {

    public static boolean idOpen(char i){
        return i == '(' || i == '{' || i == '[';
    }
    public static char getClose(char i){
        return switch (i) {
            case '(' -> ')';
            case '{' -> '}';
            case '[' -> ']';
            default -> 'h';
        };
    }
    public static boolean checkBalance(String sequence) {
        Stack<Character> stack = new Stack<>();
        for(char i: sequence.toCharArray()){
            if(idOpen(i)){
                stack.push(i);
            }
            else if (i != getClose(stack.pop())){
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void selfCheck() {
        String test1 = "[({})]{[]}";
        String test2 = "{({})}{";

        assert checkBalance(test1);
        assert !checkBalance(test2);
    }
}
