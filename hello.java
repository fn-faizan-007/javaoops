class printName{
    String name;
    public void shoeName(){
        System.out.println("Hello "+name+" In the world of java!");
    }
}

public class hello {
    public static void main(String[] args) {
        printName faizan=new printName();
        faizan.name="Muhammad Faizan";
        faizan.shoeName();
        
    }
}
