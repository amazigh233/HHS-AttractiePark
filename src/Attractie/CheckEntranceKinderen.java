package Attractie;

public class CheckEntranceKinderen implements CheckEntranceAttractie {
    @Override
    public boolean checkEntrance(int leeftijd, int lengteInCm) {
        return leeftijd < 18 && lengteInCm > 150;
    }
}
