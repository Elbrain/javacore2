package lesson1;

public class Human implements Activities {
    protected int runDistance;
    protected int jumpHeight;

    public Human(int runDistance, int jumpHeight) {
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public boolean run (int currentDistance) {
        System.out.println("Длина забега - " + currentDistance + ". Способности человека - " + this.runDistance);
        if (this.runDistance > currentDistance){
            System.out.println("Человек успешно пробежал ");
            return true;
        }
        else System.out.println("Человек не добежал");
        return false;
    }

    @Override
    public boolean jump(int currentHeight) {
        System.out.println("Высота препятсвия - " + currentHeight + ". Способности человека - " + this.jumpHeight );
        if (this.jumpHeight> currentHeight){
            System.out.println("Человек успешно перепрыгнул");
            return true;
        }
        else System.out.println("Человек не допрыгнул");
        return false;
    }
}
