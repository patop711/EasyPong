package sk.uniza.fri.hra;

import sk.uniza.fri.objekty.Doska;
import sk.uniza.fri.objekty.Lopta;
import sk.uniza.fri.shapesge.Manager;

import java.util.ArrayList;

public class Hra {
    private Manager manager;
    private Lopta lopta;
    private Doska hrac1;
    private Doska hrac2;

    private ArrayList<Doska> dosky;

    public Hra() {
        this.manager = new Manager();
        this.manager.manageObject(this);
        this.lopta = new Lopta();
        this.hrac1 = new Doska();
        this.hrac2 = new Doska();
        this.hrac2.setX(790);
        this.dosky = new ArrayList<>();
        this.dosky.add(this.hrac1);
        this.dosky.add(this.hrac2);
    }

    public void hraj(int rychlostLopticky) throws InterruptedException {
        while (!this.lopta.jeKoniec()) {
            this.lopta.hybSa();

            for (Doska doska : this.dosky) {
                if (this.lopta.prekryvajuSa(doska)) {
                    this.lopta.setSmerY();
                }
            }
            Thread.sleep(rychlostLopticky);
        }
        if (this.lopta.jeKoniec()) {
            System.out.println("Lopta isla mimo plochy!");
            System.exit(0);
        }
    }

    public void posunHore() {
        this.hrac1.posunHore();
    }

    public void posunDole() {
        this.hrac1.posunDole();
    }

    public void posunDoleDruhy() {
        this.hrac2.posunDole();
    }

    public void posunHoreDruhy() {
        this.hrac2.posunHore();
    }

}
