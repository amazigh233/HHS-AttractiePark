package Menu;

import Attractie.Attractie;
import org.w3c.dom.Attr;

import java.util.Scanner;

public class Menu {
    private Attractie attractie;
    public Scanner scanner =new Scanner(System.in);

    public Menu() {
        this.attractie = new Attractie("bilal",4);
    }

    public int intro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welkom, kies waar u controle over wilt hebben");
        System.out.println("1. Volwassen-attractie");
        System.out.println("2. kinder Attractie");
        int keuze = scanner.nextInt();

        return keuze;
    }

    public void volwassenMenu() {
        System.out.println("1. check entrance voor volwassenen");
        System.out.println("2. Toon alle  namen van volwassen attracties");
        System.out.println("3. Add bezoeker");
        System.out.println("4. Toon aantal volwassen attracties");
        System.out.println("5. Toon aantal toegevoegde namen");


    }
    public void werkNemerMenu() {
        if(intro() == 1) {
            this.volwassenMenu();
            int keuze = scanner.nextInt();
            if(keuze == 1) {
                System.out.println(this.attractie.checkEntranceVolwassen());
            }
        }else if(intro() ==2) {
            this.kinderenMenu();
        }
    }

    public void kinderenMenu() {
        System.out.println("1. check entrance voor kinderen");
        System.out.println("2. Toon alle  namen van kinder attracties");
        System.out.println("3. Add bezoeker");
        System.out.println("4. Toon aantal kinder attracties");
        System.out.println("5. Toon aantal toegevoegde namen");
    }
}
