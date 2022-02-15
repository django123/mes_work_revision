import java.util.Scanner;
import java.io.*;
import java.nio.file.*;

public class NombrePremier {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) throws IOException {
        Scanner input = null;
        try {
            input = new Scanner(new File("file.txt"));
        } catch (Exception ex) {
            System.out.println("Can not open file.");
            System.exit(0);
        }

        while (input.hasNextInt()) {
            int number = input.nextInt();
            int reste;
            boolean flag = true;
            for (int i = 2; i < number / 2; i++) {
                reste = number % i;
                if (reste == 0) {
                    flag = false;
                    break;
                }

            }
            if (flag) {
                System.out.println(number + " est un nombre prémier");
            } else {
                System.out.println(number + " n'est pas un nombre premier");
            }
        }
        input.close();

    }

}