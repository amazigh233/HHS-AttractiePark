package Input;

import java.util.Scanner;

public class InputBepaalKorting {
    private Scanner scanner = new Scanner(System.in);



    public String dagVanDeWeek() {
        System.out.println("welke dag is het vandaag?");
        String dag = scanner.nextLine();
        return dag;
    }

    public int kiesSoortMember() {
        System.out.println("kies 1 voor normale bezoeker, kies 2 voor lifetime bezoeker, kies 3 voor jaarlijkse bezoeker");
        int aantal = scanner.nextInt();
        scanner.nextLine();
        return  aantal;
    }
    public int aantalKeerBezocht() {
        System.out.println("Vul in hoe vaak de bezoeker is gekomen");
        int aantal = scanner.nextInt();
        scanner.nextLine();
        return  aantal;
    }

    public int leeftijdBezoeker() {
        System.out.println("Vul de leeftijd van de bezoeker in");
        int aantal = scanner.nextInt();
        scanner.nextLine();
        return  aantal;
    }
}
