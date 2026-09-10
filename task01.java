// A Student is an object in a university management System. Analyze the concept and identify the data
// members that a Student class should have. Also analyze the behavior of student in a university
// management System and identify the methods that should be included in Student class.

class student{
    String name;
    int Id;
    String section;
    student(){
        System.out.println("I am a constructor!");

    }
    public void showalldata(){
        System.out.println("Yor name is "+name);
        System.out.println("Your id will be "+ Id);
        System.out.println("Your Scetion will be "+section);
    }
}



public class task01 {
    public static void main(String[] args) {
        student faizan =new student();
        faizan.name="Muhammad Faizan";
        faizan.Id=23;
        faizan.section="D";
        faizan.showalldata();

    }
    
}
