package AdapterPatternAnalogDigital;

public interface IDigitalSignal {

    byte[] getDigit();

    void setDigit(byte[] digitalData);

    void printDigital();
}
