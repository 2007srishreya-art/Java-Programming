public class animalsound {
    public static void main(String[] args) {
        Animal a= new Animal();
        ass b= new ass();

        a.sound();
        b.sound();
    }
}
class Animal{
    void sound(){
        System.out.println("meowww meoww");
    }
}
    class ass extends Animal{
           @Override
     void sound(){
    System.out.println("dhechuu dhechuu");
}
    }
