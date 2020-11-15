package lesson1;

public class Cat implements Activities {
    protected int runDistance;
    protected int jumpHeight;

    public Cat(int runDistance, int jumpHeight) {
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public boolean run (int currentDistance) {
        System.out.println("Длина забега - " + currentDistance + ". Способности Кота - " + this.runDistance);
        if (this.runDistance > currentDistance){
            System.out.println("Кот успешно пробежал");
            return true;
        }
        else System.out.println("Кот не добежал");
        return false;
    }

    @Override
    public boolean jump(int currentHeight) {
        System.out.println("Высота препятсвия - " + currentHeight + ". Способности Кота - " + this.jumpHeight );
        if (this.jumpHeight> currentHeight){
            System.out.println("Кот успешно перепрыгнул");
            return true;
        }
        else System.out.println("Кот не допрыгнул");
        return false;
    }
}
