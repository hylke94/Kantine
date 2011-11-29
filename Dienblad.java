
/**
 * Klasse Dienblad
 * 
 * @author Pim
 * @version 1.0
 */

import java.util.ArrayList;

public class Dienblad
{
    //--- Instantievariabelen
    
    private ArrayList<Artikel> artikelen;
    
    Artikel artikel = new Artikel();
    
    //--- Constructors
    
    public Dienblad(){
        artikelen = new ArrayList<Artikel>();
    }
    
    
    //--- Getters
    
    public int getAantalArtikelen(){
        return artikelen.size();
    }
    
    public double getTotaalPrijs(){
        
        double totaalPrijs = 0;
        double artikelPrijs = 0;
        
        
        for(int i = 0; i < artikelen.size(); i++){
            artikelPrijs = artikelen.get(i).getArtikelPrice();
            totaalPrijs += artikelPrijs;
        }
        
        return totaalPrijs;
    }
    
    //--- Setters
    
    
    //--- Voids
    
    public void voegToe(Artikel artikel){
        artikelen.add(artikel);
    }
    
    
}
