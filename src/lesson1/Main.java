package lesson1;

public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall(5);
        Treadmill treadmill1 = new Treadmill(10);
        Wall wall2 = new Wall(7);
        Human human1 = new Human(12, 6);
        Robot robot1 = new Robot(8, 4);
        Cat cat1 = new Cat(4, 12);
        Activities[] participant = {human1, robot1, cat1};
        Obstacles[] obstacles = {wall1, treadmill1, wall2};
        for (Activities activities : participant) {
            System.out.println();
            for (Obstacles obstacle : obstacles) {
                boolean check;
                if (obstacle.getClass().getSimpleName().equals("Wall")) {
                    check = activities.jump(obstacle.getValue());
                } else {
                    check = activities.run(obstacle.getValue());
                }
                if (!check) break;

            }
        }
    }
}
