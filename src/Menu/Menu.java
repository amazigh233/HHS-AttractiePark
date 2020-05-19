package Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {


    private ArrayList<MenuKeuze> menu;


    public Menu() {
        menu = new ArrayList<MenuKeuze>();
        menu.add(new MenuKeuzeVolwassenen());
        menu.add(new MenuKeuzeKind());
        menu.add(new MenuKeuzeAttractiePark());
        menu.add(new MenuKeuzeGetAllMembers());
        menu.add(new MenuKeuzeKorting());

    }

    //code smell Switch Statements opgelost dmv ‘replace conditional with polymorphis
    public boolean checkGeldigeInvoer(int invoer) {
        for(MenuKeuze keuzeMenu: menu) {
            if(keuzeMenu.getNummer() == invoer) {
                return true;
            }
        }
        return false;
    }
    //code smell Switch Statements opgelost dmv ‘replace conditional with polymorphis

    public void voerMenuKeuzeUit(int invoer) {
        for(MenuKeuze keuzeMenu: menu) {
            if(keuzeMenu.getNummer() == invoer) {
                keuzeMenu.start();
            }
        }
    }

    public void start () {

        Scanner scanner = new Scanner(System.in);
        int invoer;

        do {
            System.out.println ();

            for (MenuKeuze keuze : menu) {
                System.out.println (keuze);
            }

            System.out.println ();
            System.out.print ("Maak uw keuze: ");
            invoer = scanner.nextInt ();
            System.out.println ();
            voerMenuKeuzeUit(invoer);
            System.out.println ("= Einde ========");
        }
        while (checkGeldigeInvoer (invoer));

        System.exit (1);

    }


}


