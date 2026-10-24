package homework;

public class Homework5 {

        public static void main(String[] args) {

            int[] numbers = {12, 5, 8, -3, 21, 7, 0, 15, 2, 9};

            for (int i = 0; i < numbers.length - 1; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] > numbers[j]) {
                        int temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;
                    }
                }
            }
            for (int i = 0; i < numbers.length; i++) {
                if (i > 0) {
                    System.out.print(" ");
                }
                System.out.print(numbers[i]);
            }
            System.out.println();
            numbers[0] = 12;
            numbers[1] = 5;
            numbers[2] = 8;
            numbers[3] = -3;
            numbers[4] = 21;
            numbers[5] = 7;
            numbers[6] = 0;
            numbers[7] = 15;
            numbers[8] = 2;
            numbers[9] = 9;

            for (int i = 0; i < numbers.length - 1; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] < numbers[j]) {
                        int temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;
                    }
                }
            }
            for (int i = 0; i < numbers.length; i++) {
                if (i > 0) {
                    System.out.print(" ");
                }
                System.out.print(numbers[i]);
            }
            System.out.println();
        }
    }

