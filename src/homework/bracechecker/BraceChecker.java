package homework.bracechecker;

import java.util.Stack;

public class BraceChecker {

    private final String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack<Character> braces = new Stack<>();
        Stack<Integer> positions = new Stack<>();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (c == '{' || c == '[' || c == '(') {
                braces.push(c);
                positions.push(i);

            } else if (c == '}' || c == ']' || c == ')') {
                if (braces.isEmpty()) {
                    System.out.println("Error: closed " + c + " but not opened at " + i);
                    return;
                }

                char opened = braces.pop();
                positions.pop();

                boolean matches = (opened == '{' && c == '}')
                        || (opened == '[' && c == ']')
                        || (opened == '(' && c == ')');

                if (!matches) {
                    System.out.println("Error: opened " + opened + " but closed " + c + " at " + i);
                    return;
                }
            }
        }

        if (!braces.isEmpty()) {
            char opened = braces.pop();
            int position = positions.pop();
            System.out.println("Error: opened " + opened + " at " + position + " but not closed");
            return;
        }

        System.out.println("No errors");
    }
}
