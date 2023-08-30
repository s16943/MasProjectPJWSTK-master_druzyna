package Persons;

import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.UUID;
import java.util.Vector;
import Team.Druzyna;
import Trening.TreningIndywidualny;
import Trwalosc.ObjectPlus;

/************************************************************************
Opis : Klasa do tworzenia piłkarzy
************************************************************************/

public class Pilkarz extends Person{

	
	//Treningi Indywidualne w dwoch klasach
	private ArrayList<TreningIndywidualny> TrenerzyIndywidualni = new ArrayList<TreningIndywidualny>();
	private Druzyna druzyna;
	private Statystyki statystyki; 
	
	public static enum Noga {
		Lewa, Prawa, Obie;
	}

	public static enum Pozycja {
		Bramkarz, Obronca, Pomocnik, Napastnik;
	}

	public static enum Umiejetnosci{
		Szybkosc,Technika,Dosrodkowania,Strzal,Podania,Drybling,Obrona,Wslizgi
	}
	

	
	private String PilkarzID;
	private List<Umiejetnosci> ListaUmiejtnosci;
	private String Narodowosc;
	private Pozycja pozycja;
	private Noga noga;

	public Pilkarz(String _imie, String _nazwisko, Date _dataurodzenia,Kontrakt kt,
			Noga _noga, Pozycja _poz){
		super(_imie, _nazwisko, _dataurodzenia,kt);
		this.pozycja = _poz;
		this.noga = _noga;
		statystyki = new Statystyki();
		ListaUmiejtnosci = new ArrayList<Umiejetnosci>();
		PilkarzID = UUID.randomUUID().toString();
		dodajPilkarza(this);

	}
	public Pilkarz(String _imie, String _nazwisko, Date _dataurodzenia,Kontrakt kt,
			Noga _noga, Pozycja _poz,String _Narodowosc){
		super(_imie, _nazwisko, _dataurodzenia,kt);
		this.pozycja = _poz;
		this.noga = _noga;
		statystyki = new Statystyki();
		ListaUmiejtnosci = new ArrayList<Umiejetnosci>();
		PilkarzID = UUID.randomUUID().toString();
		Narodowosc = _Narodowosc;
		dodajPilkarza(this);

	}
        public Pilkarz(String _imie, String _nazwisko, Date _dataurodzenia,Kontrakt kt,
			Noga _noga, Pozycja _poz,Statystyki st){
		super(_imie, _nazwisko, _dataurodzenia,kt);
		this.pozycja = _poz;
		this.noga = _noga;
		statystyki = st;
		ListaUmiejtnosci = new ArrayList<Umiejetnosci>();
		PilkarzID = UUID.randomUUID().toString();
		dodajPilkarza(this);

	}
	

	public String toString() {
		String result = "Imie = " + this.getImie() + "\n" + "Nazwisko = "
				+ this.getNazwisko() + "\n"  
				+ ((this.GetNarodowosc() == null) ? "" : "Narodowo��: " + Narodowosc + "\n") + "Data Urodzenia = "
				+ this.GetStringDataUrodzenia() + "\n" + "Wiek = " + this.getWiek()
				+ "\n" + "Pozycja = " + this.getImie() + "\n" + "Noga = "
				+ this.getNoga() + "\n"
				+ this.getStatystyki().toString() + "\n" + "Umiejetnosci = "
				+ this.WypiszUmiejetnosci() + "\n";

		return result;

	}
	
	public static Double WyliczSredniaWieku(){
		Double result = 0.0;
		if(getEkstensja().size() == 0){
			return result;
		}
		
		for(Pilkarz eks : getEkstensja()){
			result += eks.getWiek();
		}
		result = result/getEkstensja().size();
		
		return result;
		
	}
	
	public Pozycja getPozycja() {
		return pozycja;
	}

	public Noga getNoga() {
		return noga;
	}


	public static void ShowEkstensja(){
		for(Pilkarz pilk : getEkstensja()){
			System.out.println(pilk.toString());
		}
	}
	
	private void dodajPilkarza(Pilkarz pilkarz) {
            if(!pilkarz.equals(pilkarz)){
		getEkstensja().add(pilkarz);
            }
	}

	public static void usunPilkarz(Pilkarz pilkarz) {
		getEkstensja().remove(pilkarz);
		
	}

	public static Vector<Pilkarz> getEkstensja(){
		return ObjectPlus.getEkstensja(Pilkarz.class);
	}
	
	//
	public void usunDruzyne(Druzyna dr){
            if(druzyna != null){
		if(druzyna.equals(dr)){
			druzyna = null;
                        dr.usunPilkarzazDruzyny(this);
		}
            }
	}
        
        public Druzyna getDruzyna(){
            return druzyna;
        }
        
	public void dodajDruzyne(Druzyna dr){
            if(druzyna == null){
                druzyna = dr;
                dr.dodajPilkarz(this);
            }else{
            if(!druzyna.equals(dr)){
                    druzyna.usunPilkarzazDruzyny(this);
                    druzyna = dr;
                    dr.dodajPilkarz(this);
                 }
               }
	}
	public void DodajTreningIndywidualny(TreningIndywidualny tr){
		if(!TrenerzyIndywidualni.contains(tr)){

			tr.setCoach(tr.getCoach());
			tr.setPilkarz(tr.getPilkarz());
			tr.setdataTreningu(tr.getDatatreningu());
			tr.setRodzajTreningu(tr.getRodzaj());
			TrenerzyIndywidualni.add(tr);
			
		}
	}
	public void usunTreningIndywidualny(TreningIndywidualny tr){
		if(TrenerzyIndywidualni.contains(tr)){
			TrenerzyIndywidualni.remove(tr);
		}
	}

	

	public void UsunUmiejetnosc(Umiejetnosci umiej) {
		List<Integer> indexToRemove = new ArrayList<Integer>();
		for (int i = 0; i < ListaUmiejtnosci.size(); i++) {
			if (ListaUmiejtnosci.get(i).equals(umiej)) {
				indexToRemove.add(i);
			}
		}
		for (int i = indexToRemove.size() - 1; i >= 0; i--) {
			ListaUmiejtnosci.remove(i);
		}
	}

	public void DodajUmiejetnosc(Umiejetnosci umiej) {
		ListaUmiejtnosci.add(umiej);
	}

	public String WypiszUmiejetnosci() {
		if(ListaUmiejtnosci.size() == 0){
			return "Brak";
		}
		String result = "";
		result += "{";
		

		for (Umiejetnosci um : ListaUmiejtnosci) {
			if (ListaUmiejtnosci.get(ListaUmiejtnosci.size() - 1).equals(um)) {

				result += um;
			} else

				result += um + " , ";
		}
		result += "}";
		return result;
	}

	public Statystyki getStatystyki() {
		return statystyki;
	}
	public List<Umiejetnosci> getUmiejetnosci(){
		return ListaUmiejtnosci;
	}
	public String GetNarodowosc(){
		return Narodowosc;
	}
        
	public void setStatystyki(Statystyki st){
		statystyki = st;
         }
	public void setNarodowosc(String _narod){
		Narodowosc = _narod;
	}
	public String getPilkarzID(){
		return PilkarzID;
	}

    public void setPozycja(Pozycja pozycja) {
        this.pozycja = pozycja;
        System.out.print(getEkstensja().size());
    }

    public void setNoga(Noga noga) {
        this.noga = noga;
    }
        

}
