package AttractiePark;

import Bezoeker.BezoekerList;

public class CheckEntranceAttractiePark {


    //primitive datatype
    private int getMaxPersonen;
    private int getTotaleBezoeker;

    public CheckEntranceAttractiePark() {
        AttractiePark attractiePark = AttractiePark.getInstance();
        this.getMaxPersonen = attractiePark.getMaxPersonen();
        BezoekerList bezoekerList = new BezoekerList();
        this.getTotaleBezoeker =bezoekerList.getBezoekers().size();
    }

    public String checkIfVol(int aantal) {
        String msg ="Bezoeker kunnen attractiepark betreden";
        if(this.getTotaleBezoeker + aantal >= this.getMaxPersonen) {
            msg = "vol, bezoekers kunnen attractie park niet betreden";
        }
        return msg;
    }
}
