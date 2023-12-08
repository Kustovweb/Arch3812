import java.awt.Color;
import Enum.TypeCar;
import Enum.TypeFuel;
import Enum.TypeGearBox;

public abstract class Car {

    private String make;

    private String model;

    private Color color;

    private TypeCar bodyType;

    private int wheelsNumber;

    private TypeFuel fuel;

    private TypeGearBox gearBox;

    private float EngineCap;

    public Car(String make, String model, Color color, TypeCar bodyType, int wheelsNumber, TypeFuel fuel,
            TypeGearBox gearBox, float engineCap) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.wheelsNumber = wheelsNumber;
        this.fuel = fuel;
        this.gearBox = gearBox;
        EngineCap = engineCap;
    }

    public void movement(){

    }
    
    public void maintenance(){
    
    }
    
    public boolean trnLights(){
    return true;
    }
    
    public String getMake() {
    return make;
    }
    
    public void setMake(String make) {
    this.make = make;
    }
    
    public String getModel() {
    return model;
    }
    
    public void setModel(String model) {
    this.model = model;
    }
    
    public TypeCar getBodyType() {
    return bodyType;
    }
    
    public void setBodyType(TypeCar bodyType) {
    this.bodyType = bodyType;
    }
    
    public int getNumberWheels() {
    return wheelsNumber;
    }
    
    public void setNumberWheels(int wheelsNumber) {
    this.wheelsNumber = wheelsNumber;
    }
    
    public TypeFuel getFuelType() {
    return fuel;
    }
    
    public void setFuelType(TypeFuel fuel) {
    this.fuel = fuel;
    }
    
    public TypeGearBox getGearBoxType() {
    return gearBox;
    }
    
    public void setGearBoxType(TypeGearBox gearBox) {
    this.gearBox = gearBox;
    }
    
    public Color getBodyColor() {
    return color;
    }
    
    public void setBodyColor(Color color) {
    this.color = color;
    }
    
    public float getEngineCap() {
    return EngineCap;
    }
    
    public void setEngineCap(int EngineCap) {
    this.EngineCap = EngineCap;
    }
    
    public boolean trnWrps(){
    return true;
    }

}