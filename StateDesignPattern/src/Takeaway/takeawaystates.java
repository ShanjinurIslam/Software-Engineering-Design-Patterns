package Takeaway;

interface takeawaystates {
    void update(takeaway_shop shop) ;
}

class initial implements takeawaystates{

    @Override
    public void update(takeaway_shop shop) {

    }
}

class menuchoice implements takeawaystates{

    @Override
    public void update(takeaway_shop shop) {

    }
}

class payment implements takeawaystates{

    @Override
    public void update(takeaway_shop shop) {

    }
}

class deliver implements takeawaystates{

    @Override
    public void update(takeaway_shop shop) {

    }
}