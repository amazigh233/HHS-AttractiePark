package Attractie;

import Input.InputAttractiePark;

// large class opgelost dmv exracht class
public class Entrance {
    private CheckEntranceAttractie checkEntranceAttractieVolwassen;
    private CheckEntranceAttractie CheckEntranceAttractieKinderen;
    private InputAttractiePark input;

    public Entrance() {
        this.checkEntranceAttractieVolwassen = new CheckEntranceVolwassenen();
        this.CheckEntranceAttractieKinderen = new CheckEntranceKinderen();
        this.input = new InputAttractiePark();
    }

    public boolean getCheckEntranceAttractieVolwassen() {
        return this.checkEntranceAttractieVolwassen.checkEntrance(getInput().enterAge(), getInput().enterHeight());
    }

    public boolean getGetCheckEntranceAttractieKinderen() {
        return this.CheckEntranceAttractieKinderen.checkEntrance(getInput().enterAge(), getInput().enterHeight());
    }


    public InputAttractiePark getInput() {
        return this.input;
    }

}
