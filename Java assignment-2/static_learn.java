public class static_learn {
    int a = 10;
    static int b = 20;

    static void show(){
        System.out.println("this is static methood Its not contan non static variable plick a" +b);
    }
    void hide(){
        System.out.println("non static contans all type of variable"+a+" "+b);
    }    
     public static void main(String[] args) {
        static_learn s = new static_learn();
        s.hide();
        static_learn.show();
    }
}