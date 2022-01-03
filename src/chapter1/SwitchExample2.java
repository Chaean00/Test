package chapter1;

import java.util.Scanner;

public class SwitchExample2 {
    public static void main(String[] args) {

        int month = 0;
        int day = 0;

        Scanner s = new Scanner(System.in);

        System.out.println("몇월? ");
        month = s.nextInt();

        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                day = 31;
                break;
            case 2:
                day = 28;
                break;
            case 4: case 6: case 9: case 11:
                day = 30;
                break;
            default:
                break;
        }

        System.out.println(month + "월은 " + day + "일 까지 있습니다.");
    }
}