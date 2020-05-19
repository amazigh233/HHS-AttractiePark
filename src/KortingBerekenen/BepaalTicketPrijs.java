package KortingBerekenen;

import Input.Input;

public class BepaalTicketPrijs {
    // long method ‘replace method with method object
    public int bepaalKorting()  {
        Input input = new Input();
        return new BepaalKorting( input.dagVanDeWeek(), input.kiesSoortMember(), input.aantalKeerBezocht(), input.leeftijdBezoeker()).ComputePriceWithDiscountEdit() ;
    }
}
