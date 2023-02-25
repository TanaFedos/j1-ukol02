package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka;

    public void start() {
        zofka = new Turtle();

        Color cerna = new Color(0, 0, 0);

        zofka.setLocation(100, 200);
        nakresliKolecko(10, new Color(255, 187, 255));
        zofka.setLocation(158, 315);
        zofka.turnRight(30);
        nakresliRovnostrannyTrojuhelnik(103, new Color(205, 183, 158));

        zofka.setLocation(420, 110);
        nakresliKolecko(10, new Color(28, 134, 238));
        zofka.setLocation(400, 240);
        nakresliKolecko(15, new Color(24, 116, 205));
        zofka.setLocation(380, 430);
        nakresliKolecko(20, new Color(16, 78, 139));
        zofka.setLocation(330, 270);
        nakresliKolecko(5, cerna);
        zofka.setLocation(565, 270);
        nakresliKolecko(5, cerna);

        zofka.setLocation(1100, 600);
        zofka.turnRight(60);
        nakresliObdelnik(140, 200, new Color(69, 139, 0));
        zofka.turnLeft(90);
        nakresliObdelnik(100, 200, new Color(0, 139, 69));
        nakresliKolecko(12, cerna);
        zofka.setLocation(815, 630);
        zofka.turnRight(90);
        nakresliPravouhlyRovnoramennyTrojuhelnik(80, new Color(105, 105, 105));
        zofka.setLocation(1070, 655);
        nakresliKolecko(5, cerna);
        zofka.setLocation(980, 655);
        nakresliKolecko(5, cerna);


    }

    private void nakresliPravouhlyRovnoramennyTrojuhelnik(double velikostStrany, Color barvaCary) {
        zofka.setPenColor(barvaCary);
        zofka.move(velikostStrany);
        zofka.turnLeft(90);
        zofka.move(velikostStrany);
        zofka.turnLeft(135);
        var velikostPrepony = Math.sqrt(2 * Math.pow(velikostStrany, 2));
        zofka.move(velikostPrepony);
    }

    private void nakresliKolecko(double velikostKolecka, Color barvaCary) {
        zofka.setPenColor(barvaCary);
        for (int i = 0; i < 36; i++) {
            zofka.turnRight(10);
            zofka.move(velikostKolecka);
        }

    }


    private void nakresliObdelnik(double velikostStranyA, double velikostStranyB, Color barvaCary) {
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
