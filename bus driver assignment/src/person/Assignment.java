package person;

import java.util.Arrays;

public class Assignment {

    private Person person;
    private Routeandturn[] routeandturns;

    public Assignment(Person person, Routeandturn[] routeandturns) {
        this.person = person;
        this.routeandturns = routeandturns;
    }


    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Routeandturn[] getRouteandturns() {
        return routeandturns;
    }

    public void setRouteandturns(Routeandturn[] routeandturns) {
        this.routeandturns = routeandturns;
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "person=" + person +
                ", routeandturns=" + Arrays.toString(routeandturns) +
                '}';
    }
}
