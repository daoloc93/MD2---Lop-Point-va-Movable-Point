public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        MovablePoint movablePoint = new MovablePoint(2,2,1,1);

        System.out.println("Speed trước khi move:");
        System.out.println(movablePoint.toString());
        movablePoint.move();
        System.out.println("Speed sau khi move:");
        System.out.println(movablePoint.toString());


    }
}
