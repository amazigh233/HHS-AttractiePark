package Attractie;

import Input.Input;

// large class opgelost dmv exracht class
public class Entrance {
    private CheckEntranceAttractie checkEntranceAttractieVolwassen;
    private CheckEntranceAttractie CheckEntranceAttractieKinderen;
    private Input input;

    public Entrance() {
        this.checkEntranceAttractieVolwassen = new CheckEntranceVolwassenen();
        this.CheckEntranceAttractieKinderen = new CheckEntranceKinderen();
        this.input = new Input();
    }

    public boolean getCheckEntranceAttractieVolwassen() {
        return this.checkEntranceAttractieVolwassen.checkEntrance(getInput().enterAge(), getInput().enterHeight());
    }

    public boolean getGetCheckEntranceAttractieKinderen() {
        return this.CheckEntranceAttractieKinderen.checkEntrance(getInput().enterAge(), getInput().enterHeight());
    }


    public Input getInput() {
        return this.input;
    }

}
