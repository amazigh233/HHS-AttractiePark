package Bezoeker;

public abstract class Bezoeker {
    public String naam;
    public String memberType;


    public Bezoeker(String naam) {
        this.naam = naam;
    }

     public abstract String soortMember();
}