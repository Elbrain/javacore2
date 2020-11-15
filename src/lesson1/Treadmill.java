package lesson1;
public class Treadmill implements Obstacles {
    protected int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    public int getValue() {
        return distance;
    }
}
