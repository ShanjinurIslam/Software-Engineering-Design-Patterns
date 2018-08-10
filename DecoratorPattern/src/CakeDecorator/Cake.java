package CakeDecorator;

public interface Cake {
    int getPrice() ;
    String getDescription() ;
}

class Chocolate implements Cake{

    @Override
    public int getPrice() {
        return 20;
    }

    @Override
    public String getDescription() {
        return "Chocolate Flavor ";
    }
}

class Vanilla implements Cake{

    @Override
    public int getPrice() {
        return 15;
    }

    @Override
    public String getDescription() {
        return "Vanilla ";
    }
}

class RedVelvet implements Cake{

    @Override
    public int getPrice() {
        return 18;
    }

    @Override
    public String getDescription() {
        return "Red Velvet";
    }
}
