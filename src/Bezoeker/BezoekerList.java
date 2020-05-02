package Bezoeker;

import java.util.ArrayList;
import java.util.List;

public class BezoekerList {
    private List<Bezoeker>bezoekers;

    public BezoekerList() {
        this.bezoekers = new ArrayList<Bezoeker>();
        this.bezoekers.add(new NormaleBezoeker("bilal"));
        this.bezoekers.add(new JaarlijksBezoeker("bilal"));
        this.bezoekers.add(new LifeTimeBezoeker("bilal"));

    }

    public List<Bezoeker> getBezoekers() {
        return bezoekers;
    }

    public String getBezoekersMemberType() {
        StringBuilder empty = new StringBuilder();
        for(Bezoeker b: this.bezoekers) {
            empty.append(b.soortMember() + " ");
        }
        return empty.toString();
    }

    public String getBezoekersNaam() {
        StringBuilder empty = new StringBuilder();
        for(Bezoeker b: this.bezoekers) {
            empty.append(b.naam + " ");
        }
        return empty.toString();
    }

    @Override
    public String toString() {
        return "BezoekerList{" +
                "bezoekers=" + bezoekers +
                '}';
    }
}
