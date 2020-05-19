package Attractie;

import Input.Input;

import java.util.ArrayList;
import java.util.List;

public class AttractieList {
    private List<Attractie>attracties;

    public AttractieList() {
        this.attracties = new ArrayList<Attractie>();
        this.attracties.add(new VolwassenAttractie("Golath", 20, 5));
        this.attracties.add(new KinderAttractie("Hello kitty", 20, "Hello-Kitty"));
    }

    public String getAttractiesNamen() {

        StringBuilder empty = new StringBuilder();
        for(Attractie b: this.attracties) {
            empty.append(b.getNaam() + " ");
        }
        return empty.toString();
    }

    @Override
    public String toString() {
        return "Volwassen attracties namen: " + this.getAttractiesNamen();
    }
}



