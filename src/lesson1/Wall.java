package lesson1;
public class Wall implements Obstacles {
    protected int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getValue() {
        return height;
    }
}
