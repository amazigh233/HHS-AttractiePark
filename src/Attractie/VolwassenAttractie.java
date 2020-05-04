package Attractie;

public class VolwassenAttractie extends Attractie {
    private int aantalLoops;
    public VolwassenAttractie(String naam, Integer aantalZitplaatsen, int aantalLoops) {
        super(naam, aantalZitplaatsen);
        this.aantalLoops = aantalLoops;
    }

    public int getAantalLoops() {
        return aantalLoops;
    }
}
