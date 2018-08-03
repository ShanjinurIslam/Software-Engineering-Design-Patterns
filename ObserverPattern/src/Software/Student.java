package Software;

public class Student {
    private String name ;
    private String roll ;
    private String e_mail ;
    private String msg ;

    public Student(){
    }

    public Student(String name,String roll,String e_mail){
        this.name = name ;
        this.roll = roll ;
        this.e_mail = e_mail ;
    }

    public String getRoll() {
        return roll;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void update(String message) {
        this.msg = message ;
    }
}
