package Bezoeker;

public class LifeTimeBezoeker extends Bezoeker {


    public LifeTimeBezoeker(String naam) {
        super(naam);
        this.memberType = "lifeTime";
    }

    @Override
    public String soortMember() {
        return this.memberType;
    }
}
