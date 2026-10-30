package Association;

public class Brand {
    Car c;
    void display(){
        System.out.println(c);
    }

    public static void main(String[]args) {
        Brand b = new Brand();
        Car k = new Car();
        b.c=k;
        k.company= "Honda Civic";
        k.company1="Toyota";
        k.company2= " Corolla";
        k.company3="Sonata";

        b.display();

    }
}