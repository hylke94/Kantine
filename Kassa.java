import java.util.ArrayList;

/**
 * Class Kassa
 * 
 * @author Pim Vellinga
 * @version 1.0
 */
public class Kassa
{
    //-- Variabelen
    private ArrayList<Artikel> artikel;
    private Dienblad dienblad;
    private Persoon persoon;
    private Kassarij kassarij;
    
    private int aantalArtikelen;
    private int hoeveelheidGeld;
    
    //-- Constructor
    
    public Kassa(Kassarij kassarij){
        artikel = new ArrayList<Artikel>();
        
        this.kassarij = kassarij;
    }
    
    //-- Getters 
    
    /**
     * Returns the amount of items
     * 
     * @return int items;
     */
    
    public int aantalArtikelen(){
        aantalArtikelen += dienblad.getAantalArtikelen();
        return aantalArtikelen;
    }
    
    /**
     * Returns the total amount of money earned
     * 
     * @return int Money;
     */
    
    public int hoeveelheidGeldInKassa(){        
        hoeveelheidGeld += dienblad.getTotaalPrijs();
        
        return hoeveelheidGeld;
    }
    
    //-- Setters
    
    //-- Void
    /**
     * Makes person pay
     * 
     * @return void
     */
    
    public void rekenAf(Persoon persoon){
        persoon.dienblad.getAantalArtikelen();
        aantalArtikelen();
        dienblad.getTotaalPrijs();
    }
    
    /**
     * Reset some values
     * 
     * @return void
     */
    
    public void resetKassa(){
        aantalArtikelen = 0;
        hoeveelheidGeld = 0;
    }
}
