package KortingBerekenen;

import Input.InputBepaalKorting;

public class BepaalTicketPrijs {
    // long method ‘replace method with method object
    public int bepaalKorting()  {
        InputBepaalKorting input = new InputBepaalKorting();
        return new BepaalKorting( input.dagVanDeWeek(), input.kiesSoortMember(), input.aantalKeerBezocht(), input.leeftijdBezoeker()).ComputePriceWithDiscountEdit() ;
    }
}
