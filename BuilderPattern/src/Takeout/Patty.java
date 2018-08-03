package Takeout;

interface Patty {
    String getPatty();
}

class Single implements Patty{

    @Override
    public String getPatty() {
        return "Patty: Single";
    }
}

class Double implements Patty{
    @Override
    public String getPatty() {
        return "Patty: Double";
    }
}


