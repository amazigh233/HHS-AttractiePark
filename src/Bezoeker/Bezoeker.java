package Bezoeker;

public abstract class Bezoeker {
    //liskov en pullup fields
    public String naam;
    public String memberType;


    public Bezoeker(String naam) {
        this.naam = naam;
    }

     public abstract String soortMember();


}
