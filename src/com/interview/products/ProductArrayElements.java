package com.interview.products;

/**
 * Find Max value of product of any two elements of an array,
 * and also find second Max value also.
 *
 */
public class ProductArrayElements {
    public static void main(String[] args) {
        int[] intValues = { 12, 25, 5, 8, 2, 26, 15, 9, 3, 1, 4, 7, 10 };
        String strMaxProduct = maxProduct(intValues);
        System.out.println(strMaxProduct);

        String strSecondMaxProduct = secondMaxProduct(intValues);
        System.out.println(strSecondMaxProduct);

        String strMaxProductConsecutive = maxProductConsecutive(intValues);
        System.out.println(strMaxProductConsecutive);
    }

    private static String maxProduct(int[] intValues) {
        int a = intValues[0], b = intValues[1];
        int n = intValues.length;

        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                if (intValues[i] * intValues[j] > a * b) {
                    a = intValues[i];
                    b = intValues[j];
                }
        return "Max product pair is {" +a + ", " + b + "}, product is :"+ a*b;
    }

    private static String maxProductConsecutive(int[] intValues) {
        int a = intValues[0], b = intValues[1];
        int n = intValues.length -1;

        for (int i = 0; i < n; i++){
            if (intValues[i] * intValues[i+1] > a * b) {
                a = intValues[i];
                b = intValues[i + 1];
            }
        }
        return "Max product consecutive pair is {" +a + ", " + b + "}, product is :"+ a*b;
    }

    private static String secondMaxProduct(int[] intValues) {
        // Initialize max product pair
        int a = intValues[0], b = intValues[1];
        // Second Max Pair
        int c=0, d=0;

        int n = intValues.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(intValues[i] * intValues[j] > a * b) {
                    c = a;
                    d = b;
                    a = intValues[i];
                    b = intValues[j];
                } else if((intValues[i] * intValues[j] < a * b) && (intValues[i] * intValues[j] > c * d)){
                    c = intValues[i];
                    d = intValues[j];
                }
            }
        }
        return "Second max product pair is {" +c + ", " + d + "}, product is :"+ c*d;
    }
}
