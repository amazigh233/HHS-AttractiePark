package Attractie;

public class KinderAttractie extends Attractie {
    private String thema;
    public KinderAttractie(String naam, Integer aantalZitplaatsen, String thema) {
        super(naam, aantalZitplaatsen);
        this.thema = thema;
    }

    public String getThema() {
        return this.thema;
    }
}
