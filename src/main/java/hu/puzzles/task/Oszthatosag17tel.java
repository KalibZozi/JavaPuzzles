package hu.puzzles.task;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. oldal, 2021. 1. korcsoport
 * Oszthatóság 17-el
 */
public class Oszthatosag17tel {

  public  String kozbulsoSzamok = "";

    public List<String> run(List<String> bemenet) {
        List<String> kimenet = new ArrayList<>();
        String bemenetiSzam = bemenet.get(0);
        if(Integer.parseInt(bemenetiSzam)%17 ==0){
            kimenet.add("IGEN");
        } else {
            kimenet.add("NEM");
        }
        osztas17(Integer.parseInt(bemenet.get(0)));
        kimenet.add(kozbulsoSzamok);
        return kimenet;
    }


    public void osztas17(int bemenetiSzam) {
        int vegeSzam = bemenetiSzam % 10;
        int elejeSzam = bemenetiSzam / 10;
        int ujSzam = elejeSzam - (vegeSzam) * 5;
        if(ujSzam>=0) {
            kozbulsoSzamok += ujSzam + " ";
        }

        if(ujSzam<=0){
            if(kozbulsoSzamok.length()>0 )    {
                kozbulsoSzamok = kozbulsoSzamok.substring(0,kozbulsoSzamok.length()-1);
            }
            return;

    }
        osztas17(ujSzam);



    }



    public int kivonas (int ertek){
        int visszaSzam = -- ertek;
        if (visszaSzam <= 0){
            return visszaSzam;
        }
        return kivonas(visszaSzam);
    }





}
