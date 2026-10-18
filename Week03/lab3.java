import org.w3c.dom.ls.LSOutput;

class hello {
    void h(){
        System.out.println("Hello World");
    }
    }
    class friends{
    String name;
    friends(String n){
        name=n;
    }
    void print(){
        System.out.println("Friend"+" "+name);
    }
    }
public class lab3{
    static void main(String[] args) {
        hello h1=new hello();
        h1.h();

        friends f1 =new friends("Musa");
        friends f2 =new friends("Najam");
        friends f3 =new friends("Ali Saqib");
        friends f4 =new friends("Talha Rasheed");
        friends f5 =new friends("Mohammad Hassan");
        f1.print();
        f2.print();
        f3.print();
        f4.print();
        f5.print();
    }
}
