public class Car  {
    protected String model;
    private double weight;
    private double power;

    public Car(String model, double weight, double power) {
        this.model = model;
        this.weight = weight;
        this.power = power;
    }

    public void setPower(double power) {
        this.power = power;
    }
}
class Lorry extends Car{
    private double loadCapacity;

    public Lorry(String model, double weight, double power, double loadCapacity) {
        super(model, weight, power);
        this.loadCapacity = loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
    public void setModer(String s){
        super.model=s;
    }
}
