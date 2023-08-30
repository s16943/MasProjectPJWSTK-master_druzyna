package Persons;

import java.util.ArrayList;
import java.util.Date;
import Team.Druzyna;
import Trening.TreningIndywidualny;

/************************************************************************
Opis : Klasa do tworzenia trenerów
************************************************************************/

public class Coach extends Person{

	
	private ArrayList<TreningIndywidualny> listaTreningowIndywidualnych = new ArrayList<TreningIndywidualny>();
	private ArrayList<Druzyna> ListaDruzyn = new ArrayList<Druzyna>();
	
	public Coach(String _imie, String _nazwisko, Date _dataurodzenia,Kontrakt kt) {
		super(_imie, _nazwisko, _dataurodzenia,kt);
	}
	
	public void usunDruzyneTrenera(Druzyna dr){
		if(ListaDruzyn.contains(dr)){
			ListaDruzyn.remove(dr);
			dr.zwolnijTrenera();
		}
	}
	public void dodajDruzyneTrenera(Druzyna dr){
		if(!ListaDruzyn.contains(dr)){
			ListaDruzyn.add(dr);
			dr.ZatrudnijTrenera(this);
		}
	}
	public void usunTreningIndywidualny(TreningIndywidualny tr){
		if(listaTreningowIndywidualnych.contains(tr)){
			listaTreningowIndywidualnych.remove(tr);
		}
	}
	public void dodajDodajTreningIndywidualny(TreningIndywidualny tr){
		if(!listaTreningowIndywidualnych.contains(tr)){

			tr.setCoach(tr.getCoach());
			tr.setPilkarz(tr.getPilkarz());
			tr.setdataTreningu(tr.getDatatreningu());
			tr.setRodzajTreningu(tr.getRodzaj());
			listaTreningowIndywidualnych.add(tr);
		}
	}
	public String toString(){
		String result = "Imie = " + this.getImie() + "\n" + "Nazwisko = "
				+ this.getNazwisko() + "\n"  + 
				"Data Urodzenia = " + this.GetStringDataUrodzenia() + "\n" + "Wiek = " + this.getWiek();
		
		return result;
	}
}
