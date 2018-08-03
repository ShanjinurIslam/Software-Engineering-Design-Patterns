package RideSharingApp;

class UberMoto implements RideSharingApp{

    @Override
    public float calculateFare(int distance, int persons, int t) {
        System.out.println();
        System.out.print("Uber Moto: ");
        return 25 + distance*12;
    }
}
