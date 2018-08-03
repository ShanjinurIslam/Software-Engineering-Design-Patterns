package RideSharingApp;

public class Context {
    RideSharingApp rideSharingApp ;
    Context(RideSharingApp r){
        this.rideSharingApp = r ;
    }

    float execute(int n,int d,int t){
        return rideSharingApp.calculateFare(n,d,t) ;
    }
}
