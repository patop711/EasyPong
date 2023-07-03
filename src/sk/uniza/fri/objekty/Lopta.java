package sk.uniza.fri.objekty;

import sk.uniza.fri.shapesge.Circle;

public class Lopta {
    private Circle lopta;
    private byte smerY;
    private int lavyX;
    private int lavyY;
    private int pravyX;
    private int pravyY;

    public Lopta() {
        this.lopta = new Circle();
        this.lopta.setX(400);
        this.lopta.setY(400);
        this.lopta.makeVisible();
        this.lavyX = this.getLopta().getX() - 5;
        this.lavyY = this.getLopta().getY() - 5;
        this.pravyX = this.getLopta().getX() + 5;
        this.pravyY = this.getLopta().getX() + 5;
        this.smerY = 1;
    }

    public void hybSa() {
        this.lopta.moveVertical(this.smerY);
        this.lopta.moveHorizontal(this.smerY);
        this.lavyX += this.smerY;
        this.lavyY += this.smerY;
        this.pravyX += this.smerY;
        this.pravyY += this.smerY;
        System.out.println(lavyX);
        System.out.println(lavyY);
    }

    public void setSmerY() {
        if (this.smerY == 1) {
            this.smerY = -1;
        } else {
            this.smerY = 1;
        }

    }

    public int getLavyX() {
        return lavyX;
    }

    public int getLavyY() {
        return lavyY;
    }

    public int getPravyX() {
        return pravyX;
    }

    public int getPravyY() {
        return pravyY;
    }

    public Circle getLopta() {
        return this.lopta;
    }

    public boolean jeKoniec() {
        return (this.lavyX < 1 && this.lavyY < 1) || (this.pravyX >= 795 && this.pravyY >= 795);
    }
}
