package person;

public class Routeandturn {

    private Route route;
    private int turn;

    public Routeandturn(Route route, int turn) {
        this.route = route;
        this.turn = turn;
    }


    public void setRoute(Route route) {
        this.route = route;
    }

    public int getTurn() {
        return turn;
    }

    public void setTurn(int turn) {
        this.turn = turn;
    }

    @Override
    public String toString() {
        return "Routeandturn{" +
                "route=" + route +
                ", turn=" + turn +
                '}';
    }
}

