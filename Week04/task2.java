class student{
    public student(String roll, int age, String name) {
        this.roll = roll;
        this.age = age;
        this.name = name;
    }

    private String name ;
    private int age;
    private String roll;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

}
public class task2{
    static void main(String[] args) {
        student b = new student("Hashir Zahid",19,"2026(S)-CYS-40");
        System.out.println(b.getName());
        System.out.println(b.getAge());
        System.out.println(b.getRoll());
    }
}