
/**
 * Class KantimeSimulatie
 * 
 * @author Pim
 * @version 1.0
 */
public class KantineSimulatie
{
    //-- Variabelen
    
    private Kantine kantine;
    
    
    //-- Constructor
    
    public KantineSimulatie(){
        kantine = new Kantine();   
    }
    
    //-- Getters
    
    //-- Setters
    
    //-- Voids
    
    public void simuleer(int dagen){
        for(int i = 1; i <= dagen; i++){
            for(int j = 0; j < 10+i; j++){
                kantine.loopPakSluitAan();
            }
            
            // Verwerk de rij voor de kassa
            kantine.verwerkRij();
            
            // Druk dagtotalen af;
            
            System.out.println("## Dagtotaal - Geld voor dag: "+ i +" = " + kantine.hoeveelheidGeldInKassa() + "##");
            System.out.println("## Dagtotaal - Producten voor dag: "+ i +" = " + kantine.aantalArtikelen() + "##");
            System.out.println();
            
            // Reset de kassa
            
            kantine.resetKassa();
        }
    }
    
}
