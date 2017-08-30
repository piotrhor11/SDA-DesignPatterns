package ObserverPatternAmbulance;

public class Ambulance implements IAmbulance {

    private boolean occupied;
    private String name;
    private String incident;
    private IOperator operator;

    public Ambulance(String name, IOperator operator) {
        this.name = name;
        this.operator = operator;
    }

    public String getName() {
        return name;
    }

    public boolean isOccupied() {
        return occupied;
    }

    @Override
    public void update() {
        if (!occupied) {
            driveToIncident();
        }
    }

    private void driveToIncident() {
        System.out.printf("\n Ambulance %s going to accidence", name);
    }
}
