package UniversalSerialBus;

interface usbC {
    void dataTransfer(String bus) ;
}

class USBCAdapter implements usbC{
    usb2 usb ;
    USBCAdapter(String bus){
        if(bus.equalsIgnoreCase("2.0")){
            usb = new USB_2() ;
        }
        if(bus.equalsIgnoreCase("1.1")){
            usb = new USB_11() ;
        }
    }
    @Override
    public void dataTransfer(String bus) {
        if(bus.equalsIgnoreCase("2.0")){
            usb.busv2();
        }
        if(bus.equalsIgnoreCase("1.1")){
            usb.busv1();
        }
    }
}

class genericUSB implements usbC{
    USBCAdapter adapter ;
    @Override
    public void dataTransfer(String bus) {
        if(bus.equalsIgnoreCase("3.0")){
            System.out.println("USB 3.1");
        }
        else {
            adapter = new USBCAdapter(bus);
            adapter.dataTransfer(bus) ;
        }
    }
}