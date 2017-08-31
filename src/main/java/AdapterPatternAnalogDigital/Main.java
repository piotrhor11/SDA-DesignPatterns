package AdapterPatternAnalogDigital;

public class Main {

    public static void main(String[] args) {

        RadioFM radioFM = new RadioFM(64);
        double[] signal = radioFM.getAnalog();
        for (double probe : signal) {
            System.out.printf("%f ", probe);
        }
    }
}
