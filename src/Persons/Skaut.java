package Persons;

import java.util.Date;

/************************************************************************
Opis : Klasa do tworzenia skautów
************************************************************************/


public class Skaut extends Person{

    public static enum RodzajSzukany{
        Napastnik,Pomocnik,Obronca,Bramkarz;
    }
    
    private RodzajSzukany szukRodz;
    
    
    public Skaut(String _imie, String _nazwisko, Date _dataurodzenia, Kontrakt _kt,RodzajSzukany _szukRodz) {
        super(_imie, _nazwisko, _dataurodzenia, _kt);
        this.szukRodz = _szukRodz;
    }
    
    
    
}
