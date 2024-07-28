//Constructor

public class Constructor {
    int a;
    String name;
    Constructor()
    {
        a=9793; name="Nitishsingh";
    }
    void show(){
        System.out.println(a+ " "+name);
    }
}
class B{
    public static void main(String[] args) {
        Constructor ref=new Constructor();
        ref.show();

    }

}
