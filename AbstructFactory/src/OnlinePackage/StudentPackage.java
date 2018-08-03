package OnlinePackage;

class StudentPackage implements HolidayPackage{

    @Override
    public MacBook getMacBook() {
        return new MacBookAir();
    }

    @Override
    public Beats getBeats() {
        return new EP();
    }
}
