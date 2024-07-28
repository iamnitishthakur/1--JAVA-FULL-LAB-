//Copy constructor

public class CopyConstructor {
    int a; String b;
    CopyConstructor()
    {
        a=10; b="Nitish";
        System.out.println(a+ " "+b);

    }
    CopyConstructor (CopyConstructor ref){
        a = ref.a;
        b= ref.b;
        System.out.println(a+" "+b);

    }
}class cpy{
    public static void main(String[] args) {
        CopyConstructor r =new CopyConstructor();
        CopyConstructor r2 =new CopyConstructor(r);
    }
}
