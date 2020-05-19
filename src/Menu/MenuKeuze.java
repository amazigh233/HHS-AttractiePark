package Menu;

import Attractie.Entrance;

public abstract class MenuKeuze {
    private int nummer;
    private String omschrijving;
    private Entrance entrance;


    public MenuKeuze(int nummer, String omschrijving) {
        this.nummer = nummer;
        this.omschrijving = omschrijving;
        this.entrance = new Entrance();
    }
    public int getNummer() {
            return nummer;
    }

    public Entrance getEntrance() {
        return entrance;
    }

    @Override
    public String toString() {
        return "MenuKeuze{" +
                "nummer=" + nummer +
                ", omschrijving='" + omschrijving + '\'' +
                '}';
    }

    public abstract void start();
}
