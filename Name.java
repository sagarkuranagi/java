//  import java.util.Arrays;
 
public class Name{
    public static void main(String[] args) {  
      String name = "sagar";
      System.out.println("Name length"+name.length());
        for(int i=name.length()-1; i>=0; i--){
          System.out.println(name.charAt(i));
      }
    }
  }

class Main {
    public static void main(String[] args) {
        String name = "dct";
        String result = "";
        for(int i= name.length()-1; i>=0; i--){
          result = result + name.charAt(i);  
        }
        System.out.println(result);
    }
}