package Menu;

import Bezoeker.BezoekerList;

public class MenuKeuzeGetAllMembers extends MenuKeuze {
    //primitive datatype
    private String getBezoekers;

    public MenuKeuzeGetAllMembers() {
        super(4, "alle bezoekers");
        BezoekerList bezoekerList = new BezoekerList();

        this.getBezoekers = bezoekerList.toString();

    }

    @Override
    public void start() {
        System.out.println(this.getBezoekers);

    }
}
