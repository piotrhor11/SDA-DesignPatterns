package ObserverPatternAmbulance;

public interface IOperator {

    void registerObserver(IAmbulance ambulance);

    void removeObserver(IAmbulance ambulance);

    void notifyObservers();

}
