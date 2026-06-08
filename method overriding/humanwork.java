public class humanwork {
    public static void main(String[] args) {
        human a= new human();
        soldiers b= new soldiers();

        a.work();
        b.work();
    }
}

class human{
    void work(){
        System.out.println("tearcher teach us");
    }
}
class soldiers extends human{
    @Override
    void work(){
    System.out.println("soliders protect us");
}
}



