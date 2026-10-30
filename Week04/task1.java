class info{
      private String name = "Hashir Zahid";
      private int age = 19;
      private String roll = "2026-Cys-40";

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
public class task1{
    static void main(String[] args) {
        info b = new info();
        System.out.println(b.getName());
        System.out.println(b.getAge());
        System.out.println(b.getRoll());
    }
}