package AC;

public class AC {
    Remote state ;
    public void setState(Remote state){
        this.state = state ;
    }

    public Remote getState(){
        return state ;
    }

    public void buttonPress(){
        state.change(this);
    }
}
