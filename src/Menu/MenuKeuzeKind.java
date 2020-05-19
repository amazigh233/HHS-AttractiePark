package Menu;

public class MenuKeuzeKind extends MenuKeuze {


    public MenuKeuzeKind() {
        super(2, "Toegangs controller");
    }

    @Override
    public void start() {
        System.out.println(this.getEntrance().getGetCheckEntranceAttractieKinderen());

    }
}
