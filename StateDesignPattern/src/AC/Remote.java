package AC;

abstract class Remote {
    String state_name ;
    public abstract String getState_name() ;
    public abstract void change(AC ac);
}

class low extends Remote{

    @Override
    public String getState_name() {
        return "Low";
    }

    @Override
    public void change(AC ac) {
        ac.setState(new high());
    }
}

class high extends Remote{

    @Override
    public String getState_name() {
        return "High";
    }

    @Override
    public void change(AC ac) {
        ac.setState(new low());
    }
}

