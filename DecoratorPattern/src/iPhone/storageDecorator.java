package iPhone;

class storageDecorator extends phoneDecorator {
    phone phone ;
    String storage ;
    storageDecorator(phone phone,String storage){
        this.phone = phone ;
        this.storage = storage ;
    }

    @Override
    public String getDetails() {
        return phone.getDetails() + " Storage - "+ storage ;
    }

    @Override
    protected int getPrice() {
        return phone.getPrice() + (storage.equals("64")?0:100);
    }
}

class colorDecorator extends phoneDecorator {
    phone phone ;
    String color ;
    colorDecorator(phone phone,String color){
        this.phone = phone ;
        this.color = color ;
    }

    @Override
    public String getDetails() {
        return phone.getDetails() + " Color - "+ color ;
    }

    @Override
    protected int getPrice() {
        return phone.getPrice() ;
    }
}

