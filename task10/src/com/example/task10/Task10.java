package com.example.task10;

public class Task10 {

    public static boolean compare(float a, float b, int precision) {
        if (a == Float.POSITIVE_INFINITY && b == Float.POSITIVE_INFINITY){
            return true;
        }
        else if (a == Float.NEGATIVE_INFINITY && b == Float.NEGATIVE_INFINITY){
            return true;
        }
        else if (Float.isNaN(a) && Float.isNaN(b)){
            return true;
        }
        else if (Math.abs(a - b) < Math.pow(10.0, -precision)){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        float a = 0.3f;
        float b = 0.4f;
        float sum = a + b;
        float c = 0.7f;

        boolean result = compare(sum, c, 2);
        System.out.println(result);

    }

}
