class h{
    private String name;
    private int age;

    public String getCnic() {
        return cnic;
    }
    private String cnic;
    }

public class test1 {
    static void main(String[] args) {
        h a=new h();
        a.cnic="3840347675049";
        System.out.println(a.getCnic());
    }
}