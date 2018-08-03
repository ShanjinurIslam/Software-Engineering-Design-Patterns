package FaceBookGroup;

public class Friend implements Member {
    String name ;
    Server server ;

    Friend(Server server,String name){
        this.name = name ;
        this.server = server ;
    }

    void sendMsg(String msg){
        server.send(msg,"GroupNotification",name);
    }

    @Override
    public String getType() {
        return "Friend";
    }

    @Override
    public String getName() {
        return null;
    }
}
