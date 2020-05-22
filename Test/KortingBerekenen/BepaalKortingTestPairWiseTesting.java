package KortingBerekenen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BepaalKortingTestPairWiseTesting {

    //pairwise testing
    @Test
    public void bepaalTicketPrijsTest() {
        BepaalKorting bepaalKorting = new BepaalKorting("maandag", 2,5,17);

        int actual = bepaalKorting.ComputePriceWithDiscountEdit();

        assertEquals(22, actual);
    }

    @Test
    public void bepaalTicketPrijsTestCaseTwo() {
        BepaalKorting bepaalKorting = new BepaalKorting("woensdag", 3,5,17);
        int actual = bepaalKorting.ComputePriceWithDiscountEdit();
        assertEquals(33, actual);
    }

    @Test
    public void bepaalTicketPrijsTestCaseThree() {
        BepaalKorting bepaalKorting = new BepaalKorting("zaterdag", 1,5,17);
        int actual = bepaalKorting.ComputePriceWithDiscountEdit();
        assertEquals(33, actual);
    }

    @Test
    public void bepaalTicketPrijsTestCaseFour() {
        BepaalKorting bepaalKorting = new BepaalKorting("zondag", 2,5,17);
        int actual = bepaalKorting.ComputePriceWithDiscountEdit();
        assertEquals(30, actual);
    }

    @Test
    public void bepaalTicketPrijsTestCaseFive() {
        BepaalKorting bepaalKorting = new BepaalKorting("maandag", 1,6,18);
        int actual = bepaalKorting.ComputePriceWithDiscountEdit();
        assertEquals(17, actual);
    }

    @Test
    public void bepaalTicketPrijsTestCaseSix() {
        BepaalKorting bepaalKorting = new BepaalKorting("woensdag", 3,6,18);
        int actual = bepaalKorting.ComputePriceWithDiscountEdit();
        assertEquals(25, actual);
    }

    @Test
    public void bepaalTicketPrijsTestCaseSeven() {
        BepaalKorting bepaalKorting = new BepaalKorting("zaterdag", 2,6,18);
        int actual = bepaalKorting.ComputePriceWithDiscountEdit();
        assertEquals(22, actual);
    }

    @Test
    public void bepaalTicketPrijsTestCaseEight() {
        BepaalKorting bepaalKorting = new BepaalKorting("zondag", 3,6,18);
        int actual = bepaalKorting.ComputePriceWithDiscountEdit();
        assertEquals(25, actual);
    }

    @Test
    public void bepaalTicketPrijsTestCaseNine() {
        BepaalKorting bepaalKorting = new BepaalKorting("maandag", 1,5,66);
        int actual = bepaalKorting.ComputePriceWithDiscountEdit();
        assertEquals(25, actual);
    }

    @Test
    public void bepaalTicketPrijsTestCaseTen() {
        BepaalKorting bepaalKorting = new BepaalKorting("woensdag", 2,5,66);
        int actual = bepaalKorting.ComputePriceWithDiscountEdit();
        assertEquals(30, actual);
    }

    @Test
    public void bepaalTicketPrijsTestCaseEleven() {
        BepaalKorting bepaalKorting = new BepaalKorting("zaterdag", 3,66,5);
        int actual = bepaalKorting.ComputePriceWithDiscountEdit();
        assertEquals(23, actual);
    }

    @Test
    public void bepaalTicketPrijsTestCaseTwelve() {
        BepaalKorting bepaalKorting = new BepaalKorting("zondag", 1,66,5);
        int actual = bepaalKorting.ComputePriceWithDiscountEdit();
        assertEquals(23, actual);
    }


/*    @Test
    public void bepaalTicketPrijsTestCaseThirteen() {
        BepaalKorting bepaalKorting = new BepaalKorting("dinsdag", 1,54,4);
        int actual = bepaalKorting.ComputePriceWithDiscountEdit();
        assertEquals(33, actual);
    }*/
}