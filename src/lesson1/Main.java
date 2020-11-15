package lesson1;

public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall(5);
        Treadmill treadmill1 = new Treadmill(10);
        Wall wall2 = new Wall(7);
        Human human1 = new Human(11, 6);
        Robot robot1 = new Robot(8, 4);
        Cat cat1 = new Cat(4, 12);
        Activities[] participant = {human1, robot1, cat1};
        Obstacles[] obstacles = {wall1, treadmill1, wall2};
        for (int i = 0; i < participant.length ; i++) {
            System.out.println();
            for (int j = 0; j < obstacles.length ; j++) {
                if (obstacles[j].getClass().getSimpleName().equals("Wall")){
                    boolean check = participant[i].jump(obstacles[j].getValue());
                    if (check == false) break;
                }
                else {
                    boolean check = participant[i].run(obstacles[j].getValue());
                    if (check == false) break;
                }

            }
        }
    }
}
