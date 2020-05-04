package Input;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public int enterAge() {
        int leeftijd = scanner.nextInt();
        scanner.nextLine();
        return leeftijd;
    }

    public int enterHeight() {
        int lengte = scanner.nextInt();
        scanner.nextLine();
        return lengte;
    }
}
