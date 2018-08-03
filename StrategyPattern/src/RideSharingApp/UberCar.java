package RideSharingApp;

class UberCar implements RideSharingApp{

    @Override
    public float calculateFare(int distance, int persons, int t) {
        float time_factor = 1 ;
        if(t==1) time_factor = (float) 1.5 ;
        if(t==2) time_factor = (float) 1.15;
        if(t==3) time_factor = (float) 0.9 ;
        System.out.println();
        System.out.print("Uber Car: ");
        return distance*persons*18*time_factor;
    }
}
