package OnlinePackage;

public class Main {

    public static void main(String[] args) {
        HolidayPackage p = new PackageFactory().getPackage("Business") ;
        System.out.println(p.getMacBook().getDetails());
        System.out.println(p.getBeats().getDetails());
    }
}
