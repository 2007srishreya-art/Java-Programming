public class comfort {
public static void main(String[] args) {
    bike b= new bike();
    car c= new car();

    b.comfort();
    c.comfort();

}
}
class bike{
    void comfort(){
        System.out.println("less comfortable");
    }
}
class car extends bike{
    @Override
    void comfort(){
        System.out.println("more comfortable");
    }
}

