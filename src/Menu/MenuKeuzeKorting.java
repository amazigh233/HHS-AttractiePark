package Menu;

import KortingBerekenen.BepaalTicketPrijs;

public class MenuKeuzeKorting extends MenuKeuze {
    //kan er geen primitive data type van maken aangezien het een class laadt.
    BepaalTicketPrijs bepaalTicketPrijs = new BepaalTicketPrijs();

    public MenuKeuzeKorting() {
        super(5, "Bereken ticketprijs met korting");

    }

    @Override
    public void start() {
        System.out.println(bepaalTicketPrijs.bepaalKorting() + " euro met korting");

    }
}
