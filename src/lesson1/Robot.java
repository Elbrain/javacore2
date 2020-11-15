package lesson1;

public class Robot implements Activities {
    protected int runDistance;
    protected int jumpHeight;

    public Robot(int runDistance, int jumpHeight) {
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public boolean run (int currentDistance) {
        System.out.println("Длина забега - " + currentDistance + ". Способности робота - " + this.runDistance);
        if (this.runDistance > currentDistance){
            System.out.println("Робот успешно пробежал ");
            return true;
        }
        else System.out.println("Робот не добежал");
        return false;
    }

    @Override
    public boolean jump(int currentHeight) {
        System.out.println("Высота препятсвия - " + currentHeight + ". Способности робота - " + this.jumpHeight );
        if (this.jumpHeight> currentHeight){
            System.out.println("Робот успешно перепрыгнул");
            return true;
        }
        else System.out.println("Робот не допрыгнул");
        return false;
    }
}
