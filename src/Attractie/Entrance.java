package Attractie;

import Input.Input;

public class Entrance {
    private CheckEntranceAttractie checkEntranceAttractieVolwassen;
    private CheckEntranceAttractie getCheckEntranceAttractieKinderen;
    private Input input;

    public Entrance() {
        this.checkEntranceAttractieVolwassen = new CheckEntranceVolwassenen();
        this.getCheckEntranceAttractieKinderen = new CheckEntranceKinderen();
        this.input = new Input();
    }

    public CheckEntranceAttractie getCheckEntranceAttractieVolwassen() {
        return this.checkEntranceAttractieVolwassen;
    }

    public Input getInput() {
        return this.input;
    }

    public CheckEntranceAttractie getGetCheckEntranceAttractieKinderen() {
        return this.getCheckEntranceAttractieKinderen;
    }


}
