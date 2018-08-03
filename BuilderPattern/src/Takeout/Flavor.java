package Takeout ;

interface Flavor {
    String getFlavor();
}

class Chicken implements Flavor{

    @Override
    public String getFlavor() {
        return "Flavor: Chicken";
    }
}


class Beef implements Flavor{

    @Override
    public String getFlavor() {
        return "Flavor: Beef";
    }
}