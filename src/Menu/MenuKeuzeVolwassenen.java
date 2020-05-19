package Menu;

public class MenuKeuzeVolwassenen extends MenuKeuze {
    public MenuKeuzeVolwassenen() {
        super(1, "volwassen");
    }

    @Override
    public void start() {
        System.out.println(this.getEntrance().getCheckEntranceAttractieVolwassen());
    }
}
