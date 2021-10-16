public abstract class HomeAutomation {
    int price;
    SizeAdapter size;

    abstract void setPrice(int price);

    public int calculateMeasurements(int units){
        return units*price;
    }
}