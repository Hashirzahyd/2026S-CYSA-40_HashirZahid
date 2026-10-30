class Students {
    String name;
    public Students(String name) {
        this.name = name;

    }
}
class Teacher{
    void teach(Students s1){
        System.out.println(s1.name);

    }
}
public class task1{
    public static void main(String[] args) {
        
        Students s = new Students("Hashir");
        Teacher t = new Teacher();
        t.teach(s);
    }
}

