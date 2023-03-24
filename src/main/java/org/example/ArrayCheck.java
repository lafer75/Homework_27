package org.example;

public class ArrayCheck {
    public static boolean checkArray(int[] arr) {
        boolean hasOne = false;
        boolean hasFour = false;

        for (int i : arr) {
            if (i == 1) {
                hasOne = true;
            } else if (i == 4) {
                hasFour = true;
            } else {
                return false; // якщо в масиві є елементи, інші від  1 та 4 тоді не підходить
            }
        }

        return hasOne && hasFour; // перевіряємо чи є в цьому масиві і 1 і 4
    }

}
