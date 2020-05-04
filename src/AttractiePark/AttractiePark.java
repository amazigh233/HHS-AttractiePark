package AttractiePark;

import Bezoeker.BezoekerList;

public class AttractiePark {
    private static AttractiePark singleTon = null;
    private String naam;
    private int maxPersonen;
    private BezoekerList bezoekerList;

    private AttractiePark() {
        this.naam = "HHS-AttractiePark";
        this.maxPersonen = 5;
        this.bezoekerList = new BezoekerList();
    }

    public String getNaam() {
        return naam;
    }



    public int getMaxPersonen() {
        return maxPersonen;
    }

    public static AttractiePark getInstance() {
        if(singleTon == null) {
            singleTon = new AttractiePark();
        }
        return singleTon;
    }

    public String checkIfVol() {
        String msg ="niet vol";
        if(this.bezoekerList.getBezoekers().size() >= maxPersonen) {
            msg = "vol";
        }
        return msg;
    }


}
