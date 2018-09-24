package AC;

public class Main {
    public static void main(String args[]){
        AC ac = new AC() ;
        Remote intial = new low() ;
        ac.setState(intial);
        System.out.println(ac.getState().getState_name());
        ac.buttonPress();
        System.out.println(ac.getState().getState_name());
    }
}
