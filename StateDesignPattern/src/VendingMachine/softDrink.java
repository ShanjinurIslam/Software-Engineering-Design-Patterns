package VendingMachine;

interface softDrink {
    public String getName() ;
    public float getPrice() ;
}

class Pepsi implements softDrink{

    @Override
    public String getName() {
        return "Pepsi";
    }

    @Override
    public float getPrice() {
        return 2;
    }
}

class sevenUp implements softDrink{

    @Override
    public String getName() {
        return "sevenUp";
    }

    @Override
    public float getPrice() {
        return 3;
    }
}

class Miranda implements softDrink{

    @Override
    public String getName() {
        return "Miranda";
    }

    @Override
    public float getPrice() {
        return 2;
    }
}