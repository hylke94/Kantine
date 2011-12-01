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
    private Kassarij kassarij;
    
    private int aantalArtikelen = 0;
    private int hoeveelheidGeld = 0;
    
    //-- Constructor
    
    public Kassa(Kassarij kassarij){
        artikel = new ArrayList<Artikel>();
        
        this.kassarij = kassarij;
    }
    
    //-- Getters 
    
    /**
     * Returns the amount of items
     * 
     * @return int items sold;
     */
    
    public int aantalArtikelen(){               
        return aantalArtikelen;
    }
    
    /**
     * Returns the total amount of money earned
     * 
     * @return int Money earned;
     */
    
    public int hoeveelheidGeldInKassa(){                        
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
        aantalArtikelen +=persoon.dienblad.getAantalArtikelen();
        hoeveelheidGeld += persoon.dienblad.getTotaalPrijs();
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
