package Attractie;

public class Attractie {
    private String naam;
    private Integer aantalZitplaatsen;
    private Entrance entrance;



    public Attractie(String naam, Integer aantalZitplaatsen) {
        this.naam = naam;
        this.aantalZitplaatsen = aantalZitplaatsen;
        this.entrance = new Entrance();
    }


    public String getNaam() {
        return naam;
    }



    public Integer getAantalZitplaatsen() {
        return aantalZitplaatsen;
    }
}
