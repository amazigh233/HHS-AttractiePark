package KortingBerekenen;

import Input.Input;

public class BepaalTicketPrijs {
    private Input input = new Input();
    public int bepaalKorting()  {
            return new BepaalKorting( input.dagVanDeWeek(), input.kiesSoortMember(), input.aantalKeerBezocht(), input.leeftijdBezoeker()).ComputePriceWithDiscountEdit() ;
    }
}
