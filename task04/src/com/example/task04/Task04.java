package com.example.task04;

public class Task04 {

    public static float calculate(int a, int b, String operation) {
        if (operation == "+")
            return (float)a + (float) b;
        else if (operation == "-")
            return (float)a - (float) b;
        else if (operation == "*")
            return (float)a * (float) b;
        else if (operation == "/")
            return (float)a / (float) b;

        return 0;
    }

    public static void main(String[] args) {
        float result = calculate(-25, 5, "/");
        System.out.println(result);
    }

}
