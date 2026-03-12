
class Student {
    int  id;
    String name;
    String email;
    
    
    Student(){}

  Student(int id, String name, String email){
    this.id = id;
    this.name = name;
    this.email = email;
 }
  public void details() {
        // System.out.println("id : " + id);
        System.out.println("name : " + name);
        // System.out.println("email : " + email);
        // System.out.println();
  }
}
 
public class StudentConstructoroverloading {
    public static void main(String[] args) {
        Student s1 = new Student(1, "sagar", "sagar@gmail.com");
        s1.details();
        
        Student s2 = new Student(2, "siri", "siri@gmail.com");
        s2.details();
    }
}