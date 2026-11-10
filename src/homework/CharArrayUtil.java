package homework;

public class CharArrayUtil {
    public static void main(String[] args) {

        char[] chars = {'J', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n', '!'};

        
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();


        System.out.println("Characters count: " + chars.length);
        System.out.println("First character: " + chars[0]);
        System.out.println("Last character: " + chars[chars.length - 1]);


        char c = 'a';
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                count++;
            }
        }
        System.out.println("Character '" + c + "' count: " + count);


        int vowels = 0;
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                    || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowels++;
            }
        }
        System.out.println("Vowels count: " + vowels);


        int consonants = 0;
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            boolean isLetter = (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
            boolean isVowel = ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                    || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
            if (isLetter && !isVowel) {
                consonants++;
            }
        }
        System.out.println("Consonants count: " + consonants);


        int spaces = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                spaces++;
            }
        }
        System.out.println("Spaces count: " + spaces);


        char[] rev = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            rev[i] = chars[i];
        }
        for (int i = 0; i < rev.length / 2; i++) {
            char temp = rev[i];
            rev[i] = rev[rev.length - 1 - i];
            rev[rev.length - 1 - i] = temp;
        }
        for (int i = 0; i < rev.length; i++) {
            System.out.print(rev[i]);
        }
        System.out.println();


        char[] upper = new char[chars.length];
        char[] lower = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            upper[i] = chars[i];
            lower[i] = chars[i];
        }
        for (int i = 0; i < upper.length; i++) {
            if (upper[i] >= 'a' && upper[i] <= 'z') {
                upper[i] = (char) (upper[i] - 32);
            }
            if (lower[i] >= 'A' && lower[i] <= 'Z') {
                lower[i] = (char) (lower[i] + 32);
            }
        }
        System.out.print("Uppercase: ");
        for (int i = 0; i < upper.length; i++) {
            System.out.print(upper[i]);
        }
        System.out.println();
        System.out.print("Lowercase: ");
        for (int i = 0; i < lower.length; i++) {
            System.out.print(lower[i]);
        }
        System.out.println();


        char oldChar = 'a';
        char newChar = '*';
        char[] replaced = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            replaced[i] = chars[i];
        }
        for (int i = 0; i < replaced.length; i++) {
            if (replaced[i] == oldChar) {
                replaced[i] = newChar;
            }
        }
        for (int i = 0; i < replaced.length; i++) {
            System.out.print(replaced[i]);
        }
        System.out.println();


        char[] pal = {'l', 'e', 'v', 'e', 'l'};
        boolean isPalindrome = true;
        for (int i = 0; i < pal.length / 2; i++) {
            if (pal[i] != pal[pal.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is palindrome: " + isPalindrome);


        char[] b1 = {'a', 'b', 'c', 'a', 'd'};
        char target = 'a';
        int index = -1;
        for (int i = 0; i < b1.length; i++) {
            if (b1[i] == target) {
                index = i;
                break;
            }
        }
        System.out.println("First index: " + index);


        char[] first = {'J', 'a', 'v', 'a'};
        char[] second = {'J', 'a', 'v', 'a'};
        boolean equal = first.length == second.length;
        for (int i = 0; equal && i < first.length; i++) {
            if (first[i] != second[i]) {
                equal = false;
            }
        }
        System.out.println("Arrays are equal: " + equal);


        char[] b3 = {'a', 'b', 'a', 'c', 'b', 'd', 'a'};
        for (int i = 0; i < b3.length; i++) {
            boolean seen = false;
            for (int j = 0; j < i; j++) {
                if (b3[j] == b3[i]) {
                    seen = true;
                    break;
                }
            }
            if (!seen) {
                System.out.print(b3[i] + " ");
            }
        }
        System.out.println();
    }
}
