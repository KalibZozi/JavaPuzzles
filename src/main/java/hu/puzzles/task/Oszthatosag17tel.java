package hu.puzzles.task;

//import jdk.internal.misc.FileSystemOption;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. oldal, 2021. 1. korcsoport
 * Oszthatóság 17-el
 */
public class Oszthatosag17tel {

    public List<String> run(List<String> bemenet) {
        List<String> kimenet = new ArrayList<>();

        String bemenetiSzam = bemenet.get(0);

        if (Integer.parseInt(bemenetiSzam) % 17 == 0) {
            kimenet.add("IGEN");
            kimenet.add(getNextNumber(Integer.parseInt(bemenetiSzam), ""));
        } else {
            kimenet.add("NEM");
            kimenet.add(getNextNumber(Integer.parseInt(bemenetiSzam), ""));
        }


//        kimenet.add("IGEN");

        return kimenet;
    }

    private String getNextNumber(int base, String txt) {

        int nextNumber = (base / 10) - (base % 10 * 5);
        int nextNextNumber = (nextNumber / 10) - (nextNumber % 10 * 5);

        String s = String.valueOf(nextNumber);

        if (nextNumber >= 0) {
            if (nextNextNumber > 0) {

                return s + " " + getNextNumber(nextNumber, txt);
            }
            return s;
        }
        return "";
    }

    private String getNextNumber2(int base) {

        int nextNumber = (base / 10) - (base % 10 * 5);

        if (nextNumber > 0) {
            return nextNumber + " " + getNextNumber2(nextNumber);
        }

        return "";
    }
}
