class engine {
    public void start() {
        System.out.println("Holyyyyyyyy Molyyyyyyy!!!");
    }
}

class car {
    private engine s1;

    public car(engine s1) {
        this.s1 = s1;
    }

    public void drive() {
        s1.start();
        System.out.println("Car's Driving");
    }
}

public class task2 {
    public static void main(String[] args) {
        engine a = new engine();
        car d = new car(a);
        d.drive();
    }
}