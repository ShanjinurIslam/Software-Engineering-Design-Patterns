package RideSharingApp;

class PathaoMoto implements RideSharingApp{

    @Override
    public float calculateFare(int distance, int persons, int t) {
        System.out.println();
        System.out.print("Pathao Moto: ");
        return 30 + distance*11;
    }
}
