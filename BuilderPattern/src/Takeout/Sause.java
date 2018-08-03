package Takeout;

interface Sause {
    String getSause() ;
}

class HoneyMustard implements Sause{

    @Override
    public String getSause() {
        return "Sause: Honey Mustard";
    }
}

class Naga implements Sause{

    @Override
    public String getSause() {
        return "Sause: Naga";
    }
}