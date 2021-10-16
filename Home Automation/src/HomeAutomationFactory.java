/**
 * This class implements the factory design pattern
 */

public class HomeAutomationFactory {
    public HomeAutomation getItem(String item, String size){
        if(item == null){
            return null;
        }
        if(item.equalsIgnoreCase("Sensors")) {
            HomeAutomation g= new Sensors();
            ((Sensors) g).selectSize(size);
            return g;
        }
        else if(item.equalsIgnoreCase("Thermal")){
            HomeAutomation g= new Thermal();
            ((Thermal) g).selectSize(size);
            return g;
        }
        else if(item.equalsIgnoreCase("Intensity")) {
            HomeAutomation g= new Intensity();
            ((Intensity) g).selectSize(size);
            return g;
        }
        return null;
    }
}
