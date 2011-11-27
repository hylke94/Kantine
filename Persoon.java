
/**
 * Write a description of class Persoon here.
 * 
 * @author Pim Vellinga
 * @version 1.0
 */
public class Persoon
{
    private boolean isSchrikkelJaar;
    
    private int BSN;
    
    private int dag;
    private int maand;
    private int jaar;
    
    private char Geslacht;
    
    private String Voornaam;
    private String Achternaam;
    
    
    //------ Constructor
   
    public Persoon(int BSN, int dag, int maand, int jaar, char Geslacht, String Voornaam, String Achternaam){
        this.BSN = BSN;
        
        setBirthdate(dag, maand, jaar);
        this.Geslacht = Geslacht;
        this.Voornaam = Voornaam;
        this.Achternaam =  Achternaam;
    }  
   
    
    //------ Getters
    
    /**
     * Get the BSN;
     * 
     * @return BSN;
     */
    
    public int getBSN(){
        return BSN;
    }
    
    /**
     * Get the Birthday
     * 
     * @return Geboortedatum
     */
    
    public String getGeboorteDatum(){
        String temp;
        
        if(dag == 0 && maand == 0 & jaar == 0){
            temp = "Onbekend";
        }
        else {
            temp = dag+"/"+maand+"/"+jaar;
        }
        
        return temp;
    }
    
    
    /**
     * Get gender
     * 
     * @return Gender
     */
    
    public String getGender(){
        String gender;
        
        if(Geslacht == 'M'){
            gender = "Man";
        }
        else if (Geslacht == 'V'){
            gender = "Vrouw"; 
        }
        else {
            gender = "Onbekend";
        }
        
        return gender;

    }
    
    
    /**
     * Get the first name
     * 
     * @return Voornaam
     */
    
    public String getFirstname(){
        return Voornaam;
    }
    
    /**
     * Get the last name
     * 
     * @return Achternaam
     */
    
    public String getLastname(){
        return Achternaam;
    }
    
    
    //------------------------------------- Setters
    
    
    /**
     * Set the BSN
     * 
     */
    
    public void setBSN(int BSN){
        this.BSN = BSN;
    }
    
    /**
     * Set the birthdate
     */
    
    public void setBirthdate(int dag, int maand, int jaar){
            
        if(jaar >= 1900 && jaar <= 2100){
            
            if(jaar % 4 == 0){
                if((jaar % 100 == 0) && (jaar % 400 != 0)){
                    isSchrikkelJaar = false;
                }
                else {
                    isSchrikkelJaar = true;
                }
            }
            else {
                isSchrikkelJaar = false;
            }
            
        this.jaar = jaar;
                       
            if(maand >= 1 && maand <= 12 && dag >= 1){
                
                
                if(maand <= 7 && maand % 2 == 1){
                    this.maand =  maand;
                    
                    if(dag <= 31){
                        this.dag = dag;
                    }
                    else { 
                       this.dag = 0;
                    }
                }
                else if (maand == 2) {
                    this.maand = maand;
                    
                    if(isSchrikkelJaar == true){
                        if (dag <= 29){
                            this.dag = dag;
                        }
                        else {
                            this.dag = 0;
                        }
                    }
                    else {
                        if (dag <= 28){
                            this.dag = dag;
                        }
                        else { 
                            this.dag = 0;
                        }
                    }
                }
                else if(maand <= 6 && maand %2 == 0){
                    this.maand = maand;
                    
                    if(dag <= 30){
                        this.dag = dag;
                    }
                    else { 
                        this.dag = 0;
                    }
                }
                else if(maand >= 8 && maand % 2 == 0){
                    this.maand = maand;
                    
                    if(dag <= 31){
                        this.dag = dag;
                    }
                    else { 
                        this.dag = 0;
                    }
                }
                else if (maand >= 8 && maand % 2 == 1){
                    this.maand = maand;
                    
                    if(dag <= 30){
                        this.dag = dag;
                    }
                    else { 
                       this.dag = 0;
                    }
                }
                else {
                    System.out.println("### DEBUG: " + dag + " " + maand + " " + jaar);
                }
            }
            else {
                System.out.println("### FOUT: Dit jaar slaat nergens op!");
            }
        }
        else {
            System.out.println("### FOUT: De jaren moeten liggen tussen 1900 of 2100");
        }
                
    }
    
    
    
    /**
     * Set the first name
     */
    
    public void setVoornaam(String Voornaam){
        this.Voornaam = Voornaam;
    }
    
    /**
     * Set the last name
     */
    
    public void setAchternaam(String Achternaam){
        this.Achternaam = Achternaam;
    }
    
    /**
     * Set the gender
     */
    
    public void setGender(char Geslacht){
        if (this.Geslacht != 'M' || this.Geslacht != 'V'){
            this.Geslacht = 'X';    
        }
        else { 
            this.Geslacht = Geslacht;
        }
    }
    
    
    //------- Druk af
    
    /**
     * Prints a report about the Person
     * 
     */
    
    public void drukAf(){
        System.out.println("###################################################");
        System.out.println("## Informatie over:" + getFirstname() +" " + getLastname() + "##");
        System.out.println("## BSN:" + getBSN() +"##");
        System.out.println("## Geslacht:" + getGender() +"##");
        System.out.println("## Geboortedatum:" + getGeboorteDatum() +"##");
        System.out.println("###################################################");
        System.out.println();
    }
    
    
    //------ Check Schrikkeljaar
    
    /**
     * Checks wether the given year is a leap year or not
     * 
     * @returns boolean true or false
     */
    
    public boolean checkSchrikkeljaar(int Jaar){
        this.jaar =  Jaar;
            if(jaar % 4 == 0){
                if((jaar % 100 == 0) && (jaar % 400 != 0)){
                    isSchrikkelJaar = false;
                }
                else {
                    isSchrikkelJaar = true;
                }
            }
            else {
                isSchrikkelJaar = false;
        }
        
        return isSchrikkelJaar;
        
    }
}
