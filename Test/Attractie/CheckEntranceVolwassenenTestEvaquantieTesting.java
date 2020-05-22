package Attractie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckEntranceVolwassenenTestEvaquantieTesting {


    @Test
    public void TestCaseOne() {
        CheckEntranceAttractie checkEntranceAttractie = new CheckEntranceVolwassenen();

        assertTrue(checkEntranceAttractie.checkEntrance(18, 171));
    }
    @Test
    public void TestCaseTwo() {
        CheckEntranceAttractie checkEntranceAttractie = new CheckEntranceVolwassenen();

        assertFalse(checkEntranceAttractie.checkEntrance(17, 169));
    }

    @Test
    public void TestCaseThree() {
        CheckEntranceAttractie checkEntranceAttractie = new CheckEntranceVolwassenen();
        assertFalse(checkEntranceAttractie.checkEntrance(18, 169));
    }

    @Test
    public void TestCaseFour() {
        CheckEntranceAttractie checkEntranceAttractie = new CheckEntranceVolwassenen();
        assertFalse(checkEntranceAttractie.checkEntrance(17, 171));
    }

}