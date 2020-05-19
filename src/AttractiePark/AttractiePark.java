package AttractiePark;

public class AttractiePark {
    private static AttractiePark singleTon = null;
    private int maxPersonen;
    private int ticketPrice;

    private AttractiePark() {
        this.maxPersonen = 50;
        this.ticketPrice = 30;
    }

    public static AttractiePark getInstance() {
        if(singleTon == null) {
            singleTon = new AttractiePark();
        }
        return singleTon;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public int getMaxPersonen() {
        return maxPersonen;
    }


}
