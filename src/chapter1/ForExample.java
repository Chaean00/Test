package chapter1;

public class ForExample {
    public static void main(String[] args) {
        int dan = 2;
        int times = 1;

        while (dan<=9) {
            if (dan % 2 == 1) {
                dan++;
                continue;
            }
            times = 1;
            while (times<=9) {
                System.out.println(dan + " X " + times + " = " + dan*times);
                times++;
            }
            dan++;
            System.out.println();
        }
    }
}
