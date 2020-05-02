package AttractiePark;

public class AttractiePark {
    private static AttractiePark singleTon = null;
    private String naam;
    private boolean isVol;
    private int maxPersonen;

    private AttractiePark() {
        this.naam = "HHS-AttractiePark";
        this.isVol = false;
        this.maxPersonen = 20;
        System.out.println("rt");
    }

    public String getNaam() {
        return naam;
    }

    public boolean isVol() {
        return isVol;
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


}
