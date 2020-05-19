package Menu;

import AttractiePark.AttractiePark;
import AttractiePark.CheckEntranceAttractiePark;
import Input.Input;

public class MenuKeuzeAttractiePark extends MenuKeuze {
    private CheckEntranceAttractiePark attractiePark;
    private Input input = new Input();
    public MenuKeuzeAttractiePark() {
        super(3, "check of bezoekers pretpark mogen betreden");
        this.attractiePark = new CheckEntranceAttractiePark();
    }

    @Override
    public void start() {
        System.out.println(this.attractiePark.checkIfVol(input.enterAantalPersonen()));
    }
}
