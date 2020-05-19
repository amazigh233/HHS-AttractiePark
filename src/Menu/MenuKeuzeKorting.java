package Menu;

import KortingBerekenen.BepaalTicketPrijs;

public class MenuKeuzeKorting extends MenuKeuze {
    BepaalTicketPrijs bepaalTicketPrijs = new BepaalTicketPrijs();

    public MenuKeuzeKorting() {
        super(5, "Bereken ticketprijs met korting");

    }

    @Override
    public void start() {
        System.out.println(bepaalTicketPrijs.bepaalKorting() + " euro met korting");

    }
}
