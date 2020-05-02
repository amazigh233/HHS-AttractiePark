package Bezoeker;

public class JaarlijksBezoeker extends Bezoeker {
    public JaarlijksBezoeker(String naam) {
        super(naam);
        this.memberType = "JaarlijksBezoeker";
    }

    @Override
    public String soortMember() {
        return this.memberType;
    }
}
