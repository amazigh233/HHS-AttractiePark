package Attractie;

public class CheckEntranceVolwassenen implements CheckEntranceAttractie {



    @Override
    public boolean checkEntrance(int leeftijd, int lengteInCm) {
        return leeftijd >= 18 && lengteInCm > 170;
    }
}
