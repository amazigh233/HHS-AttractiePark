package Bezoeker;

public class NormaleBezoeker extends Bezoeker {


    public NormaleBezoeker(String naam) {
        super(naam);
        this.memberType = "bezoeker";
    }

    @Override
    public String soortMember() {
       return this.memberType;
    }
}
