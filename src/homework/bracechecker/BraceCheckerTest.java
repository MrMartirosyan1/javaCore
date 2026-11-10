package homework.bracechecker;

public class BraceCheckerTest {

    public static void main(String[] args) {
        String[] tests = {
                "Hello from [Java]",
                "{Hello (Java)}",
                "{[()]}",
                "Hello Java",
                "Hello from [Java)",
                "{[(])}",
                "Hello from Java]",
                "{Hello Java",
                "((()))",
                "(()"
        };

        for (int i = 0; i < tests.length; i++) {
            System.out.println("Text: " + tests[i]);
            BraceChecker bc = new BraceChecker(tests[i]);
            bc.check();
            System.out.println();
        }
    }
}
