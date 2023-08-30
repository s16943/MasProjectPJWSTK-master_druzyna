
package Persons;

import java.util.Date;


/************************************************************************
Opis : Klasa do tworzenia lekarzy
************************************************************************/

public class Lekarz extends Person{
    
    public static enum RodzajLekarza{
        Rechabilitant,Masazysta,Pierwszego_kontaktu,Dietetyk
    }
    
    private RodzajLekarza lekRodz;

    public RodzajLekarza getLekRodz() {
        return lekRodz;
    }

    public void setLekRodz(RodzajLekarza lekRodz) {
        this.lekRodz = lekRodz;
    }
      
    public Lekarz(String _imie, String _nazwisko, Date _dataurodzenia, Kontrakt _kt,RodzajLekarza lk) {
        super(_imie, _nazwisko, _dataurodzenia, _kt);
        lekRodz = lk;
    }
      
    
}
