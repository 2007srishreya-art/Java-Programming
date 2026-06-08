public class shapearea {
    public static void main(String[] args) {
        area a= new area();
        holorectangle b= new holorectangle();

        a.shape();
        b.shape();
    }
    
}
class area{
    void shape(){
        System.out.println("here is your area of square");
    }
}
class rectangle extends area{
          @Override
void shape(){
    System.out.println("here is your area of rectangle");
}
}
   
