package Takeout;

interface Cheese {
    String getCheese() ;
}

class Chedder implements Cheese{
    @Override
    public String getCheese() {
        return "Cheese: Chedder";
    }
}

class Classic implements Cheese{
    @Override
    public String getCheese() {
        return "Cheese: Classic";
    }
}

class NoCheese implements Cheese{
    @Override
    public String getCheese() {
        return "Cheese: No Cheese";
    }
}
