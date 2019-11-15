class Dbms{
    void dbms(){
        System.out.println("dbms....");
        }
}
//derived//child//sub
public class Inheritance extends Dbms{
    void java(){
        System.out.println("java....");
    }


    public static void main(String[] args) {
        Inheritance obj=new Inheritance();
        obj.dbms();
        obj.java();
    }
}
