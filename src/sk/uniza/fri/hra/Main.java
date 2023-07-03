package sk.uniza.fri.hra;

import sk.uniza.fri.objekty.Doska;
import sk.uniza.fri.objekty.Lopta;

public class Main {
    public static void main(String[] args) {
//        Hra hra = new Hra();
//        try {
//            hra.hraj(20);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

//        Circle circle = new Circle(500, 400);
//        Circle circle1 = new Circle(490, 400);
//        circle1.changeColor("red");
//        System.out.println(circle.getX());
//        System.out.println(circle.getY());
//        System.out.println(circle);
//        circle.makeVisible();
//        circle1.makeVisible();


        Lopta lopta = new Lopta();
        Doska doska = new Doska();
        doska.setX(395);
        doska.setY(395);
        System.out.println("X: " + lopta.getLavyX() + " Y: " + lopta.getLavyY()) ;
        System.out.println();
        System.out.println("X: " + lopta.getPravyX() + " Y: " + lopta.getPravyY());
        System.out.println();
        System.out.println("X: " + doska.getHornyX() + " Y: " + doska.getHornyY());
        System.out.println("X: " + doska.getDolnyX() + " Y: " + doska.getDolnyY());
        System.out.println("Prekrivaju sa: " + lopta.prekryvajuSa(doska));

    }
}
