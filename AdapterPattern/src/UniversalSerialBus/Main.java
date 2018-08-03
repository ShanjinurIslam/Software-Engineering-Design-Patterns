package UniversalSerialBus;

public class Main {

    public static void main(String[] args) {
	    genericUSB genericUSB = new genericUSB() ;
	    genericUSB.dataTransfer("3.0");
        genericUSB.dataTransfer("1.1");
        genericUSB.dataTransfer("2.0");
    }
}
