package ObserverPatternAmbulance;

import java.util.ArrayList;

public class Operator implements IOperator {

    private ArrayList<IAmbulance> ambulances;

    public Operator() {
        ambulances = new ArrayList<>();
    }

    @Override
    public void registerObserver(IAmbulance ambulance) {
        ambulances.add(ambulance);
    }

    @Override
    public void removeObserver(IAmbulance ambulance) {
        ambulances.remove(ambulance);
    }

    @Override
    public void notifyObservers() {
        for (IAmbulance ambulance : ambulances) {
            ambulance.update();
        }
    }

    public void getStatus() {                           // Sprawdzamy jakie karetki są wolne, a jakie zajęte
        for (IAmbulance ambulance : ambulances) {
            if (ambulance instanceof Ambulance) {
                Ambulance vehicle = (Ambulance) ambulance;
                System.out.printf("\n Ambulance %s is %s", vehicle.getName(), vehicle.isOccupied() ? "is occupied" : "is free.");
            }
        }
    }

}
