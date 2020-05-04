package Menu;

import Attractie.AttractieList;
import Attractie.Entrance;
import AttractiePark.AttractiePark;
import Bezoeker.BezoekerList;
import org.w3c.dom.Attr;

import java.util.Scanner;

public class Menu {

    private MenuMessage menuMessage;
    private BezoekerList bezoekerList;
    private AttractieList attractieList;
    private AttractiePark attractiePark;
    private Entrance entrance;
    private int keuze;

    public Menu() {
        this.menuMessage = new MenuMessage();
        this.bezoekerList = new BezoekerList();
        this.entrance = new Entrance();
        this.attractieList = new AttractieList();
        this.attractiePark = AttractiePark.getInstance();
        this.keuze = keuze;
    }

    private int getKeuze() {
        return  this.keuze;
    }

    public int keuze() {
        Scanner scanner = new Scanner(System.in);
        this.keuze = scanner.nextInt();
        return keuze;
    }



    public void keuzenOne() {
        if(getKeuze() == 1) {
            System.out.println("voer uw leeftijd en lengte in");
            System.out.println(this.entrance.getCheckEntranceAttractieVolwassen().checkEntrance(this.entrance.getInput().enterAge(),this.entrance.getInput().enterHeight()));
        }
        else if(getKeuze() == 2) {
            System.out.println(this.entrance.getGetCheckEntranceAttractieKinderen().checkEntrance(30,190));
        }
    }
    public void keuzenTwo() {
        if(getKeuze() == 3) {
            System.out.println(this.bezoekerList.toString());
        }
        if(getKeuze() == 4) {
            System.out.println(this.attractieList.toString());
        }
        if(getKeuze() == 5) {
            System.out.println(this.attractieList.toString());
        }
    }
    public void menu() {
        //this.menuMessage.introMessage();


        do {
            this.menuMessage.introMessage();


            this.keuze();

            this.keuzenOne();
            this.keuzenTwo();
        }while (getKeuze() !=0);
    }




}


/*
*
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        this.menuMessage.introMessage();
        int keuzen;

        do {
            this.menuMessage.introMessage();

            keuzen = scanner.nextInt();
            if(keuzen == 1) {
                System.out.println("voer uw leeftijd en lengte in");
                System.out.println(this.entrance.getCheckEntranceAttractieVolwassen().checkEntrance(this.entrance.getInput().enterAge(),this.entrance.getInput().enterHeight()));
            }else if(keuzen == 2) {
                System.out.println(this.entrance.getGetCheckEntranceAttractieKinderen().checkEntrance(30,190));

            }else if(keuzen == 3) {
                System.out.println("Alle bezoekers op een rij");
                System.out.println(this.bezoekerList.toString());
            } else if(keuzen == 4) {
                System.out.println(this.attractiePark.checkIfVol());
            }else if(keuzen == 5) {
                System.out.println(this.attractieList.toString());
            }
        }
        while (keuzen!=0);
    }
*
* */


/*
*   public void keuzenOne() {
        if(keuze() == 1) {
            System.out.println("voer uw leeftijd en lengte in");
            System.out.println(this.entrance.getCheckEntranceAttractieVolwassen().checkEntrance(this.entrance.getInput().enterAge(),this.entrance.getInput().enterHeight()));
        }
        if(keuze() == 2) {
            System.out.println(this.entrance.getGetCheckEntranceAttractieKinderen().checkEntrance(30,190));
        }
    }
    public void keuzenTwo() {
        if(keuze() == 3) {
            System.out.println(this.bezoekerList.toString());
        }
        if(keuze() == 4) {
            System.out.println(this.attractieList.toString());
        }
        if(keuze() == 5) {
            System.out.println(this.attractieList.toString());
        }
    }



    public void menu() {
        this.menuMessage.introMessage();
        do {
            this.menuMessage.introMessage();
            this.keuzenOne();
            this.keuzenTwo();

        }while(keuze() !=0);
    }
* */