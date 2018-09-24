package iPhone;

abstract class phone {
    protected abstract String getDetails() ;
    protected abstract int getPrice() ;
}

class iPhoneXS extends phone{


    @Override
    public String getDetails() {
        return "iPhone XS";
    }

    @Override
    public int getPrice() {
        return 999;
    }
}


class iPhoneXS_Max extends phone{

    @Override
    public String getDetails() {
        return "iPhone XS Max";
    }

    @Override
    public int getPrice() {
        return 1099;
    }
}


class iPhoneXR extends phone{


    @Override
    public String getDetails() {
        return "iPhone XR";
    }

    @Override
    public int getPrice() {
        return 749;
    }
}



