import java.util.Scanner;

public class SafeInput {

    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String input;

        do {
            System.out.print(prompt + ": ");
            input = pipe.nextLine();
        } while (input.length() == 0);

        return input;
    }

    public static int getInt(Scanner pipe, String prompt) {
        int number;

        while (true) {
            System.out.print(prompt + ": ");

            if (pipe.hasNextInt()) {
                number = pipe.nextInt();
                pipe.nextLine();
                return number;
            } else {
                System.out.println("Enter a whole number.");
                pipe.nextLine();
            }
        }
    }

    public static double getDouble(Scanner pipe, String prompt) {
        double number;

        while (true) {
            System.out.print(prompt + ": ");

            if (pipe.hasNextDouble()) {
                number = pipe.nextDouble();
                pipe.nextLine();
                return number;
            } else {
                System.out.println("Enter a number.");
                pipe.nextLine();
            }
        }
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int number;

        do {
            number = getInt(pipe, prompt + " [" + low + "-" + high + "]");
        } while (number < low || number > high);

        return number;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double number;

        do {
            number = getDouble(pipe, prompt + " [" + low + "-" + high + "]");
        } while (number < low || number > high);

        return number;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String answer;

        do {
            System.out.print(prompt + " [Y/N]: ");
            answer = pipe.nextLine();
        } while (!answer.equalsIgnoreCase("Y") &&
                !answer.equalsIgnoreCase("N"));

        return answer.equalsIgnoreCase("Y");
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String input;

        do {
            System.out.print(prompt + ": ");
            input = pipe.nextLine();
        } while (!input.matches(regEx));

        return input;
    }

    public static void prettyHeader(String msg) {
        int spaces = (54 - msg.length()) / 2;

        for (int i = 0; i < 60; i++) {
            System.out.print("*");
        }

        System.out.println();
        System.out.print("***");

        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }

        System.out.print(msg);

        for (int i = 0; i < 54 - msg.length() - spaces; i++) {
            System.out.print(" ");
        }

        System.out.println("***");

        for (int i = 0; i < 60; i++) {
            System.out.print("*");
        }

        System.out.println();
    }
}


