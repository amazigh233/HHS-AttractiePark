package KortingBerekenen;

import AttractiePark.AttractiePark;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BepaalTicketPrijsTest {

    BepaalTicketPrijs bepaalTicketPrijs = new BepaalTicketPrijs();
    AttractiePark attractiePark = AttractiePark.getInstance();
    //BepaalKorting bepaalKorting = new BepaalKorting("zaterdag", 0,0,3);

    @Test
    public void bepaalTicketPrijsTest() {
        //("m", 2,2,2).Compute();
        int actual = bepaalTicketPrijs.bepaalKorting();

        assertEquals(2, actual);
    }

}