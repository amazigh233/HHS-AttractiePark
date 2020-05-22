package KortingBerekenen;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class BepaalKortingTestMCDC {


    //mcdc test
    @Test
    public void bepaalTicketPrijsTest() {
        //("m", 2,2,2).Compute();
        BepaalKorting bepaalKorting = new BepaalKorting("dinsdag", 1,6,18);

        int actual = bepaalKorting.ComputePriceWithDiscountEdit();

        assertEquals(20, actual);
    }

    @Test
    public void bepaalTicketPrijsTestCaseTwo() {
        //("m", 2,2,2).Compute();
        BepaalKorting bepaalKorting = new BepaalKorting("maandag", 3,4,65);

        int actual = bepaalKorting.ComputePriceWithDiscountEdit();

        assertEquals(27, actual);
    }

    @Test
    public void bepaalTicketPrijsTestCaseThree() {
        //("m", 2,2,2).Compute();
        BepaalKorting bepaalKorting = new BepaalKorting("dinsdag", 1,4,17);
        int actual = bepaalKorting.ComputePriceWithDiscountEdit();
        assertEquals(28, actual);
    }

    @Test
    public void bepaalTicketPrijsTestCaseFour() {
        //("m", 2,2,2).Compute();
        BepaalKorting bepaalKorting = new BepaalKorting("vrijdag", 2,4,65);
        int actual = bepaalKorting.ComputePriceWithDiscountEdit();
        assertEquals(27, actual);
    }

    @Test
    public void bepaalTicketPrijsTestCaseFive() {
        //("m", 2,2,2).Compute();
        BepaalKorting bepaalKorting = new BepaalKorting("donderdag", 3,4,18);
        int actual = bepaalKorting.ComputePriceWithDiscountEdit();
        assertEquals(30, actual);
    }

}