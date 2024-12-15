package dsa;


class static_demo{
    public static void runIt(){
        System.out.println("Hello from static method");
    }
}


public class static_keyword_demo {
    public static void main(String... args) {
        static_demo.runIt();
    }
}
