public class Task2 {
    static class Hello {
        String s() {
            System.out.println("Hello World");
            return null;
        }
    }
void main(String[] args) {
        Hello k= new Hello();
        String x=k.s();
    System.out.println(x);
}
}
