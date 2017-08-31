package AdapterPatternAnalogDigital;

import java.util.Random;

public class RadioFM implements IAnalogSignal {

    private double[] analogSignal;

    public RadioFM(int length) {
        Random rand = new Random();
        analogSignal = rand.doubles(16, 0.0, 2.0).toArray();
//        analogSignal = new double[length];
//        for (int i = 0; i < analogSignal.length; i++) {
//            analogSignal[i] = rand.nextDouble() * 2;
//        }
    }

    @Override
    public double[] getAnalog() {
        return analogSignal;
    }

    @Override
    public void setAnalog(double[] analogData) {
        this.analogSignal = analogData;
    }

    @Override
    public void printAnalog() {

    }
}
