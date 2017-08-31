package AdapterPatternAnalogDigital;

public class DigitalRadio implements IDigitalSignal {


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
