package Menu;

import AttractiePark.CheckEntranceAttractiePark;
import Input.InputAttractiePark;

public class MenuKeuzeAttractiePark extends MenuKeuze {
    private CheckEntranceAttractiePark attractiePark;
    private InputAttractiePark input = new InputAttractiePark();
    public MenuKeuzeAttractiePark() {
        super(3, "check of bezoekers pretpark mogen betreden");
        this.attractiePark = new CheckEntranceAttractiePark();
    }

    @Override
    public void start() {
        System.out.println(this.attractiePark.checkIfVol(input.enterAantalPersonen()));
    }
}
