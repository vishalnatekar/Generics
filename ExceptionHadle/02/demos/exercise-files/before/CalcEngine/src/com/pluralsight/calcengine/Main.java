package com.pluralsight.calcengine;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(args[0]));
            String inputLine;
            while((inputLine = reader.readLine()) != null)
                performOperation(inputLine);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

    }

    private static void performOperation(String inputLine) {
        String[] parts = inputLine.split(" ");
        MathOperation operation = MathOperation.valueOf(parts[0].toUpperCase());
        int leftVal = valueFromWord(parts[1]);
        int rightVal = valueFromWord(parts[2]);

        int result = execute(operation, leftVal, rightVal);

        System.out.println(inputLine + " = " + result);
    }

    static int execute(MathOperation operation, int leftVal, int rightVal) {
        return switch (operation) {
            case ADD -> leftVal + rightVal;
            case SUBTRACT -> leftVal - rightVal;
            case MULTIPLY -> leftVal * rightVal;
            case DIVIDE -> leftVal / rightVal;
        };
    }

    static int valueFromWord(String word) {
        String[] numberWords = {
                "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"
        };
        int value = -1;
        for(int index = 0; index < numberWords.length; index++) {
            if(word.equals(numberWords[index])) {
                value = index;
                break;
            }
        }
        if(value == -1)
            value = Integer.parseInt(word);

        return value;
    }

}
