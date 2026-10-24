package homework;

public class Homework1 {
   public static void main(String[] args) {
        int x = 10;
        int y = 7;

        if (x > y) {
            System.out.println("x mec e y");
        } else if (y > x){
            System.out.println("y mec e x");
        } else {
          System.out.println( "x ev y havasar en");
        }

        for (int i = 1; i <= 5; i++){
            System.out.println(i);
        }

        int a = 5;
        int b = 7;
        System.out.println("gumary =" + (a +b));

        int n = 3;

        for (int i = 1; i <= 10; i++) {
            System.out.println( n +"*" + i + "=" + (n * i));
        }
    }
}
