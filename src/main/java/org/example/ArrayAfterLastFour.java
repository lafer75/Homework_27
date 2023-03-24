package org.example;
public class ArrayAfterLastFour {
    public static int[] extractAfterLastFour(int[] inputArray) {
        int index = -1;
        for (int i = inputArray.length - 1; i >= 0; i--) {
            if (inputArray[i] == 4) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            throw new RuntimeException("В масиві не має 4");
        }

        int[] resultArray = new int[inputArray.length - index - 1];
        for (int i = index + 1; i < inputArray.length; i++) {
            resultArray[i - index - 1] = inputArray[i];
        }

        return resultArray;
    }
}

