package Attractie;

public class Attractie {
    //duplicate code opgelost pull up field methoden
    private String naam;
    private Integer aantalZitplaatsen;



    public Attractie(String naam, Integer aantalZitplaatsen) {
        this.naam = naam;
        this.aantalZitplaatsen = aantalZitplaatsen;
    }

    public String getNaam() {
        return naam;
    }

}
