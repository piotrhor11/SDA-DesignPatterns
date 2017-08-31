package AdapterPatternAnalogDigital;

public class AnalogToDigitalAdapter implements IDigitalSignal {

    IAnalogSignal analogSignal;
    byte[] digitalSignal;

    public AnalogToDigitalAdapter(IAnalogSignal analogSignal) {
        this.analogSignal = analogSignal;
        int lengthDigital = analogSignal.getAnalog().length / 8;
        digitalSignal = new byte[lengthDigital];
    }

    @Override
    public byte[] getDigit() {


        return new byte[0];
    }

    @Override
    public void setDigit(byte[] digitalData) {


    }

    @Override
    public void printDigital() {

    }
}
