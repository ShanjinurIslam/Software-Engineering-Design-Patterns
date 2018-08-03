package FaceBookGroup;

class Admin implements Member {
    String name ;
    Server server ;
    Admin(Server server,String name){
        this.name = name ;
        this.server = server ;
    }

    void sendMsg(String msg){
        server.send(msg,"AdminNotification",name);
    }

    @Override
    public String getType() {
        return "Admin";
    }

    @Override
    public String getName() {
        return null;
    }
}
