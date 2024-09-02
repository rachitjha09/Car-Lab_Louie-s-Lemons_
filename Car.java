
/**
 * Louie's lemons main code
 *
 * @author (Rachit Jha)
 * @version (12/6/23)
 */
public class Car
{
    public static final String DEALERNAME="Louie's Lemons";
    public static int totalNumberOfOilChanges=0;
    public static int totalNumberOfCarsSold=0;
    
    private String make;
    private String model;
    private int modelYear;
    private int numberOfCarOilChanges;


    public Car(String make, String model, int modelYear){
        this.make=make;
        this.model=model;
        this.modelYear=modelYear;
        totalNumberOfCarsSold++;
        numberOfCarOilChanges=0;
    }
    public static int getDealershipOilChanges(){
        return totalNumberOfOilChanges;
    }
    public static int getCarsSold(){
        return totalNumberOfCarsSold;
    }
    @Override public String toString(){
        return modelYear + " " + make + " " + model + " Oil Changes " + numberOfCarOilChanges;
    }
    public void oilChange(){
        numberOfCarOilChanges++;
        totalNumberOfOilChanges++;
    }
    public static double convertMPGtoKPL(double d){
        double kpl;
        kpl=d/2.352;
        return kpl;
    }
}