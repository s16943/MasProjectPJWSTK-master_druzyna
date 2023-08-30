package HelperClasses;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/************************************************************************
Opis : Klasa do trzymania przydatnych statycznych metod

************************************************************************/

public class HelperMethods {
    
    public static Date getDateFromString(String dtSt) throws Exception{
         
     Date date1 = null;
        try {
            date1 = new SimpleDateFormat("dd/MM/yyyy").parse(dtSt);
        } catch (ParseException ex) {
            throw new Exception();
        }
     
     return date1;
    }
    
    public static String convertDateToString(Date indate) throws Exception 
{
   String dateString = null;
   SimpleDateFormat sdfr = new SimpleDateFormat("dd/MM/yyyy");
   try{
	dateString = sdfr.format( indate );
   }catch (Exception ex ){
	throw new Exception();
   }
   return dateString;
}
}
