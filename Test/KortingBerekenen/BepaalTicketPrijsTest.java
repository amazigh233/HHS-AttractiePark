package KortingBerekenen;

import AttractiePark.AttractiePark;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class BepaalTicketPrijsTest {

    BepaalTicketPrijs bepaalTicketPrijs = new BepaalTicketPrijs();
    AttractiePark attractiePark = AttractiePark.getInstance();
    BepaalKorting bepaalKorting = new BepaalKorting("dd", 3342,0,63);
    Scanner scanner = new Scanner(System.in);


    @Test
    public void bepaalTicketPrijsTest() {
        //("m", 2,2,2).Compute();
        int actual = bepaalKorting.ComputePriceWithDiscountEdit();

        assertEquals(2, actual);
    }

}