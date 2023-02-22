package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka;

    public void start() {
        zofka = new Turtle();

        Color zelena = new Color (140,140,140);

        zofka.setLocation(100.0, 300.0);
        zofka.turnRight(90);
        nakresliRovnostrannyTrojuhelnik(100,new Color(0,127,255));

        zofka.setLocation(300.0, 300.0);
        nakresliCtverec(150,new Color(5,90,110));

        zofka.setLocation(600.0, 300.0);
        nakresliObdelnik(200,80,new Color(40,150,60));

        zofka.setLocation(1000.0, 120.0);
        nakresliKolecko(25,new Color(255,30,50));
    }

    private void nakresliKolecko(double velikostStrany, Color barvaCary) {
        zofka.setPenColor(barvaCary);
        for (int i = 0; i < 25; i++) {
            zofka.turnRight(15);
            zofka.move(velikostStrany);
        }
    }

    private void nakresliObdelnik(double velikostStranyA, double velikostStranyB,Color barvaCary) {
        zofka.setPenColor(barvaCary);
        for (int i = 0; i < 2; i++) {
            zofka.move(velikostStranyA);
            zofka.turnLeft(90);
            zofka.move(velikostStranyB);
            zofka.turnLeft(90);
        }
    }



    private void nakresliCtverec(double velikostStrany, Color barvaCary) {
        zofka.setPenColor(barvaCary);
        for (int i = 0; i < 4; i++) {
            zofka.move(velikostStrany);
            zofka.turnLeft(90);
        }
    }

    private void nakresliRovnostrannyTrojuhelnik(double velikostStrany, Color barvaCary) {
        zofka.setPenColor(barvaCary);
        for (int i = 0; i < 3; i++) {
            zofka.move(velikostStrany);
            zofka.turnLeft(120);
        }
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
