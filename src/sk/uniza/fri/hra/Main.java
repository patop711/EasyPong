package sk.uniza.fri.hra;

public class Main {
    public static void main(String[] args) {
        Hra hra = new Hra();
        try {
            hra.hraj(20);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        Circle circle = new Circle(500, 400);
//        Circle circle1 = new Circle(490, 400);
//        circle1.changeColor("red");
//        System.out.println(circle.getX());
//        System.out.println(circle.getY());
//        System.out.println(circle);
//        circle.makeVisible();
//        circle1.makeVisible();
//        Lopta lopta = new Lopta();
//        Doska doska = new Doska();
//        System.out.println(lopta.getLavyX());
//        System.out.println(lopta.getLavyY());
//        System.out.println(lopta.getPravyX());
//        System.out.println(lopta.getPravyY());
//        doska.setX(400);
//        doska.setY(395);
//        System.out.println("Prekrivaju sa: " + doska.prekrivajuSa(lopta));

    }
}
