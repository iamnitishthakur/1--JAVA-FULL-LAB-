//parameterized constructor

public class PConstructor {
    int x,y;
    PConstructor(int a, int b){
        x=a; y=b;
    }
    void show(){
        System.out.println(x+ " "+y);
    }
}
class   d{
    public static void main(String[] args) {
        PConstructor r=new PConstructor(500,200);
        r.show();
    }
}

