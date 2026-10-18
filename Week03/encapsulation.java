class s{
    private String name;
    private int age;

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    private String cnic;
}
public class encapsulation {
    static void main(String[] args) {
        s a=new s();
    a.setCnic("3840347675049");
        System.out.println(a.getCnic());
    }
}