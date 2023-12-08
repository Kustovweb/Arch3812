import java.awt.Color;

import Enum.TypeCar;
import Enum.TypeFuel;
import Enum.TypeGearBox;
import Interface.IFuelStation;
import Interface.IWip;

public class Pickup extends Car implements IFuelStation, IWip{
   public Pickup(String make, String model, Color color, int wheelsNumber, TypeFuel fuel,
            TypeGearBox gearBox, float engineCap) {
        super(make, model, color, TypeCar.PICKUP, wheelsNumber, fuel, gearBox, engineCap);
        //TODO Auto-generated constructor stub
    }

private int loadCapasity;

@Override
public void fuel() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'fuel'");
}

@Override
public void wipWindshield() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'wipWindshield'");
}

@Override
public void wipHeadlights() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'wipHeadlights'");
}

@Override
public void wipMirrors() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'wipMirrors'");
}
}
