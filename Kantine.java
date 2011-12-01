
/**
 * Class Kantine
 * 
 * @author Pim Vellinga
 * @version 1.0
 */
public class Kantine
{
    //-- Variabelen
    
    private Kassa kassa;
    private Kassarij kassarij;
    
    private Persoon persoon;
    private Persoon persoon1;
        
    private Artikel artikel1;
    private Artikel artikel2;
    
    private double hoeveelheidGeld =0;
    
    private int aantalArtikelen = 0;
    
    //-- Constructor
    
    public Kantine(){
        kassarij = new Kassarij();
        kassa = new Kassa(kassarij);
    }
    
    //-- Getters
    
    /**
     * @return geld
     */
    
    public double hoeveelheidGeldInKassa(){
        return kassa.hoeveelheidGeldInKassa();
    }
    
    /**
     * @return alle artikelen;
     */
    public int aantalArtikelen(){
        return kassa.aantalArtikelen();
    }
    
    //-- Setters
    
    //-- Voids
    
    /**
     * Maakt een nieuw Persoon, en laat deze een dienblad maken
     * Hierna worden er twee artikelen gemaakt.
     * 
     * Deze worden daarna gepakt door de persoon.
     * 
     * Hierna sluit het persoon zich aan in de rij voor de kassa.
     */
    
    public void loopPakSluitAan(){
        persoon = new Persoon(123, 29, 6, 1990, 'M', "Pim", "Vellinga");
        persoon.pakDienblad();
        
        artikel1 = new Artikel("Bier", 5);
        artikel2 = new Artikel("Pizza", 10);
        
        persoon.pakArtikel(artikel1);
        persoon.pakArtikel(artikel2);
                
        kassarij.sluitAchteraan(persoon);
    
    }
    
    
    /**
     * Verwerkt de rij voor de kassa en verwijderd de persoon daarna.
     * Er wordt een while lus gemaakt omdat dit makkelijker is.
     */
    
    public void verwerkRij(){
        while(kassarij.isErEenRij()){
            persoon1 = kassarij.eerstePersoonInRij(persoon1);
            kassa.rekenAf(persoon1);
            kassarij.verwijderPersoonUitRij();
        }
    }
    
    /**
     * Reset de kassa
     */
    
    public void resetKassa(){
        aantalArtikelen = 0;
        hoeveelheidGeld = 0;
    }
    
}
