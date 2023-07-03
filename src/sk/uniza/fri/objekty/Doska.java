package sk.uniza.fri.objekty;

import sk.uniza.fri.shapesge.Rectangle;

public class Doska {
    private Rectangle doska;
    private int hornyX;
    private int hornyY;
    private int dolnyX;
    private int dolnyY;

    public Doska() {
        this.doska = new Rectangle(10, 150);
        this.hornyX = this.doska.getX();
        this.hornyY = this.hornyX + this.getDoska().getWidth();
        this.dolnyX = this.hornyX;
        this.dolnyY = this.dolnyX + this.getDoska().getWidth();
        this.doska.makeVisible();
    }

    public int getHornyX() {
        return this.hornyX;
    }

    public int getHornyY() {
        return this.hornyY;
    }

//    public static void main(String[] args) {
//        Doska doska1 = new Doska();
//        System.out.println(doska1.hornyX);
//        System.out.println(doska1.hornyY);
//    }

    public int getDolnyX() {
        return this.dolnyX;
    }

    public int getDolnyY() {
        return dolnyY;
    }

    public void setX(int x) {
        this.doska.setX(x);
        this.hornyX = this.doska.getX();
        this.dolnyX = this.hornyX;
        this.hornyY = this.hornyX + this.getDoska().getWidth();
        this.dolnyY = this.dolnyX + this.getDoska().getWidth();

    }

    public void setY(int y) {
        this.doska.setY(y);
    }

    public Rectangle getDoska() {
        return this.doska;
    }

    public int getX() {
        return this.getDoska().getX();
    }

    public int getY() {
        return this.getDoska().getY();
    }

    public void posunHore() {
        int distance = -10;
        if (this.hornyX > 0) {
            this.doska.moveVertical(-10);
            this.hornyX += distance;
            this.hornyY += distance;
            this.dolnyX += distance;
            this.dolnyY += distance;
        }
    }

    public void posunDole() {
        int distance = 10;
        if (this.dolnyX < 800) {
            this.doska.moveVertical(10);
            this.hornyX += distance;
            this.hornyY += distance;
            this.dolnyX += distance;
            this.dolnyY += distance;
        }
    }

//    public boolean prekrivajuSa(Lopta l) {
//        return (l.getPravyX() >= this.hornyX && l.getLavyX() <= this.dolnyX) &&
//                ((l.getPravyY() >= this.hornyY && l.getPravyY() <= this.dolnyY) ||
//                        (l.getLavyY() >= this.hornyY && l.getLavyY() <= this.dolnyY));
//    }

}
