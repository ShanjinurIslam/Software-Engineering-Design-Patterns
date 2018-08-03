package FaceBookGroup;

public class Main {

    public static void main(String[] args) {
	    Server server = new Server() ;
	    Admin primaryAdmin = new Admin(server,"Spondon") ;
	    server.addAdmins(primaryAdmin);
	    primaryAdmin.sendMsg("Hello, welcome to the group");
	    Friend friend = new Friend(server,"Imtiaz") ;
	    server.addFriend(friend);
	    friend.sendMsg("Thank you. Thank you for adding us");
    }
}
