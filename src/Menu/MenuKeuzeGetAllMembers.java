package Menu;

import Bezoeker.BezoekerList;

public class MenuKeuzeGetAllMembers extends MenuKeuze {
    BezoekerList bezoekerList = new BezoekerList();

    public MenuKeuzeGetAllMembers() {
        super(4, "alle bezoekers");
    }

    @Override
    public void start() {
        System.out.println(this.bezoekerList.toString());

    }
}
