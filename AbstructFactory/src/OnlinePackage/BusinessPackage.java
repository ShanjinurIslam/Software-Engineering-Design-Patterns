package OnlinePackage;

class BusinessPackage implements HolidayPackage{

    @Override
    public MacBook getMacBook() {
        return new MacBookPro();
    }

    @Override
    public Beats getBeats() {
        return new Studio();
    }
}
