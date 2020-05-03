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

    public boolean checkEntranceKinderen() {
        return this.entrance.getGetCheckEntranceAttractieKinderen().checkEntrance(this.entrance.getInput().enterAge(),this.entrance.getInput().enterHeight());
    }

    public boolean checkEntranceVolwassen() {

        return this.entrance.getCheckEntranceAttractieVolwassen().checkEntrance(this.entrance.getInput().enterAge(),this.entrance.getInput().enterHeight());
    }

    public Integer getAantalZitplaatsen() {
        return aantalZitplaatsen;
    }
}
