package homework;

public class Homework4 {

        public static void main(String[] args) {

            int[] numbers1 = {6, 3, 8, 6, 1, 9, 6, 4, 2, 6};
            int n = 6;
            int countN = 0;
            for (int i = 0; i < numbers1.length; i++) {
                if (numbers1[i] == n) {
                    countN++;
                }
            }
            System.out.println("Count of " + n + ": " + countN);

            int[] numbers2 = {1, 5, 8, 3, 9, 2, 7, 4, 6, 10};
            for (int i = 0; i < numbers2.length / 2; i++) {
                int temp = numbers2[i];
                numbers2[i] = numbers2[numbers2.length - 1 - i];
                numbers2[numbers2.length - 1 - i] = temp;
            }
            for (int i = 0; i < numbers2.length; i++) {
                System.out.print(numbers2[i] + " ");
            }
            System.out.println();

            int[] numbers3 = {3, 6, 8, 3, 9, 6, 2, 3, 5, 6};
            int repeatedCount = 0;
            for (int i = 0; i < numbers3.length; i++) {
                boolean seenBefore = false;
                for (int j = 0; j < i; j++) {
                    if (numbers3[j] == numbers3[i]) {
                        seenBefore = true;
                    }
                }
                if (!seenBefore) {
                    int occurrences = 0;
                    for (int j = 0; j < numbers3.length; j++) {
                        if (numbers3[j] == numbers3[i]) {
                            occurrences++;
                        }
                    }
                    if (occurrences > 1) {
                        repeatedCount++;
                    }
                }
            }
            System.out.println("Repeated numbers count: " + repeatedCount);

            char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};
            int vowelsCount = 0;
            for (int i = 0; i < chars.length; i++) {
                char c = chars[i];
                if (c == 'ա' || c == 'ե' || c == 'է' || c == 'ը'
                        || c == 'ի' || c == 'ո' || c == 'օ') {
                    vowelsCount++;
                }
            }
            System.out.println("Vowels count: " + vowelsCount);

            int[] bonus1 = {4, 9, 2, 15, 7, 15, 3, 11, 6, 8};
            int max = bonus1[0];
            for (int i = 1; i < bonus1.length; i++) {
                if (bonus1[i] > max) {
                    max = bonus1[i];
                }
            }
            int secondMax = 0;
            boolean found = false;
            for (int i = 0; i < bonus1.length; i++) {
                if (bonus1[i] < max && (!found || bonus1[i] > secondMax)) {
                    secondMax = bonus1[i];
                    found = true;
                }
            }
            if (found) {
                System.out.println("Second maximum: " + secondMax);
            } else {
                System.out.println("No second maximum");
            }

            int[] bonus2 = {3, 6, 3, 8, 9, 6, 2, 3, 5, 6};
            for (int i = 0; i < bonus2.length; i++) {
                boolean appearedBefore = false;
                for (int j = 0; j < i; j++) {
                    if (bonus2[j] == bonus2[i]) {
                        appearedBefore = true;
                    }
                }
                if (!appearedBefore) {
                    System.out.print(bonus2[i] + " ");
                }
            }
            System.out.println();

            int[] bonus3 = {3, 6, 3, 8, 9, 6, 2, 3, 5, 3};
            int mostFrequent = bonus3[0];
            int maxCount = 0;
            for (int i = 0; i < bonus3.length; i++) {
                int currentCount = 0;
                for (int j = 0; j < bonus3.length; j++) {
                    if (bonus3[j] == bonus3[i]) {
                        currentCount++;
                    }
                }
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    mostFrequent = bonus3[i];
                }
            }
            System.out.println("Most frequent number: " + mostFrequent);
            System.out.println("Count: " + maxCount);
        }
    }

