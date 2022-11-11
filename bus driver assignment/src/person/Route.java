package person;

import person.Inputinfo;

import java.util.Scanner;

public class Route implements Inputinfo {
    public static int AUTO_ID = 0;
    private int routeID;
    private double distance;
    private int busstop;

    public int getRouteID() {
        return routeID;
    }

    public void setRouteID(int routeID) {
        this.routeID = routeID;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getBusstop() {
        return busstop;
    }

    public void setBusstop(int busstop) {
        this.busstop = busstop;
    }

    @Override
    public String toString() {
        return "Route{" +
                "routeID=" + routeID +
                ", distance=" + distance +
                ", busstop=" + busstop +
                '}';
    }
    @Override
    public void nhaptt(){
        this.routeID = AUTO_ID;
        AUTO_ID++;
        System.out.println("Nhập số điểm dừng:  ");
        this.busstop = new Scanner(System.in).nextInt();
        System.out.println("Nhập Khoảng cách:  ");
        this.distance = new Scanner(System.in).nextDouble();

    }

}
