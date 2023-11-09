public class thisKeyword {
    int a;
    thisKeyword(int a){
        this.a=a;
    }
    void show(){ 
        System.out.println(a);
    }    
    public static void main(String[] args) {
        thisKeyword r = new thisKeyword(100);  
        r.show();   
    }
}
