package AttractiePark;

import Bezoeker.BezoekerList;

public class CheckEntranceAttractiePark {

    private BezoekerList bezoekerList = new BezoekerList();

    private AttractiePark attractiePark;

    public CheckEntranceAttractiePark() {
        this.attractiePark = AttractiePark.getInstance();
    }

    public String checkIfVol(int aantal) {
        String msg ="Bezoeker kunnen attractiepark betreden";
        if(this.bezoekerList.getBezoekers().size() + aantal >= this.attractiePark.getMaxPersonen()) {
            msg = "vol, bezoekers kunnen attractie park niet betreden";
        }
        return msg;
    }
}
