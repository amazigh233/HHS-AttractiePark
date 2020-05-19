package KortingBerekenen;

import AttractiePark.AttractiePark;

public class BepaalKorting {

    private String dagVanDeWeek;
    private int keuzeSoortMember;
    private int aantalKeerBezocht;
    private int leeftijd;
    private int ticketPrice;

    /**
     *
     */
    public BepaalKorting(String dagVanDeWeek, int keuzeSoortMember, int aantalKeerBezocht, int leeftijd) {
        //Primitive Obsession opgelost met Preserve Whole Object
        AttractiePark attractiePark = AttractiePark.getInstance();
        this.dagVanDeWeek = dagVanDeWeek;
        this.keuzeSoortMember = keuzeSoortMember;
        this.aantalKeerBezocht = aantalKeerBezocht;
        this.leeftijd = leeftijd;

        //Preserve Whole Object
        this.ticketPrice = attractiePark.getTicketPrice();


    }

    // switch statements opgelost dmv extracht method
    public int ComputePriceWithDiscountEdit() {
        int local = this.ticketPrice;
        local -= this.soortMember();//30-3 = 27
        local -= this.bepaalKortingOpAantalKeerBezocht();
        local -= this.bepaalKortingOpLeeftijd();
        local -= this.bepaalKortingOpWeekend();
        local -= this.bepaalKortingOpMaandag();

        return local;
    }

    private int bepaalKortingOpMaandag() {
        int discount = 0;

        if (dagVanDeWeek.equals("maandag")) {
            discount += 3;
        }

        return discount;

    }
    //- is korting erbij optellen + is korting eraf halen
    public int bepaalKortingOpWeekend() {
        int discount = 0;
        if (dagVanDeWeek.equals("zaterdag") || dagVanDeWeek.equals("zondag") || dagVanDeWeek.equals("woensdag")) {
            discount  -= 5;
        }
        return discount;
    }
    public int soortMember() {
        int discount = 0;
        if (this.keuzeSoortMember == 2) {
            discount += 3;

        }
        return discount;
    }

    public int bepaalKortingOpAantalKeerBezocht() {

        int discount = 0;
        if (this.aantalKeerBezocht > 5) {
            discount += 10;
        }
        return discount;
    }

    public int bepaalKortingOpLeeftijd() {

        int discount = 0;
        if (leeftijd < 18 || leeftijd > 65) {
           discount += 2;
        }
        return discount;
    }
}

