class Umar{
    String name = "Hashir Zahid";
    int roll = 19 ;

    @Override
    public String toString() {
        return "Hashir{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                '}';
    }
}
public class task1 {
    public  static void main(String[]args) {
        Hashir u= new Hashir();
       System.out.println(u.roll);
       System.out.println(u.name);



    }

}