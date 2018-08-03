package CoffeeShop;

interface Coffee {
    String getMilk() ;
    String getCaffein() ;
    String getSugar() ;

    String getCoffeeDetails() ;
}

class CoffeeA implements Coffee{

    @Override
    public String getMilk() {
        return "Standard Milk";
    }

    @Override
    public String getCaffein() {
        return "Standard Caffein";
    }

    @Override
    public String getSugar() {
        return "Standard Sugar";
    }

    @Override
    public String getCoffeeDetails() {
        return "CoffeeA " + getMilk() +"\n\t\t" +  getCaffein() + "\n\t\t" +  getSugar();
    }
}

class CoffeeB implements Coffee{

    @Override
    public String getMilk() {
        return "Special Milk";
    }

    @Override
    public String getCaffein() {
        return "Special Caffein";
    }

    @Override
    public String getSugar() {
        return "No Sugar";
    }

    @Override
    public String getCoffeeDetails() {
        return "CoffeeB " + getMilk() +"\n\t\t" +  getCaffein() + "\n\t\t" +  getSugar();
    }
}

class CoffeeC implements Coffee{

    @Override
    public String getMilk() {
        return "Premium Milk";
    }

    @Override
    public String getCaffein() {
        return "Premium Caffein";
    }

    @Override
    public String getSugar() {
        return "Premium Sugar";
    }

    @Override
    public String getCoffeeDetails() {
        return "CoffeeC " + getMilk() +"\n\t\t" +  getCaffein() + "\n\t\t" +  getSugar();
    }
}

public class CoffeeFactory {

    Coffee produceCoffee(String type){
        if(type.equalsIgnoreCase("A")){
            return new CoffeeA() ;
        }

        else if(type.equalsIgnoreCase("B")){
            return new CoffeeB() ;
        }

        else if(type.equalsIgnoreCase("C")){
            return new CoffeeC() ;
        }

        return null ;
    }
}
