//private constructor

public class PrivateConst {
    int a ; double  b; String   c;
    PrivateConst()
    {
        a=20; b=30.12; c= null;
        System.out.println(a+ " "+b + " "+c);
    }

}
class P2const{
    public static void main(String[] args) {
        PrivateConst r = new PrivateConst();
    }
}
