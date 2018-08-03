package UniversalSerialBus;

interface usb2 {
    void busv1() ;
    void busv2() ;
}

class USB_2 implements usb2{

    @Override
    public void busv1() {

    }

    @Override
    public void busv2() {
        System.out.println("USB 2.0");
    }
}

class USB_11 implements usb2{

    @Override
    public void busv1() {
        System.out.println("USB 1.1");
    }

    @Override
    public void busv2() {

    }
}