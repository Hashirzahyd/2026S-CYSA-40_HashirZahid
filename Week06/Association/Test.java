package Association;

public class Test {
    public  static void main(String[]args) {
        Student w = new Student();
        Teacher t = new Teacher();
        t.s=w;
        t.display();

    }
}
Test class