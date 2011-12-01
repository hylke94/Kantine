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
    
    /**
     * Gets the amount of items
     * 
     * @return items
     */
    
    public int getAantalArtikelen(){
        return artikelen.size();
    }
    
    /**
     * Gets the total price of the items
     * 
     * @return total price
     */
    
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
    
    /**
     * Adds the item to an ArrayList
     * 
     * @return void
     */
    
    public void voegToe(Artikel artikel){
        artikelen.add(artikel);
    }
    
    
}
