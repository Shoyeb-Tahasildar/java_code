package dsa;


class A{
    int a=0;
}

class B extends A{
    int a=1;
}


public class InheritanceDemo {
    public static void main(String[] args) {
        A b = new B();
        System.out.println(b.a);
    }
}
