import java.util.*;
public class xyz {
    public static void xyz(String m){
        int arr[]= new int[2];
      for(int i=1;i<m.length();i=i+2){
        if(m.charAt(i)!=m.charAt(i-1)){
         arr[0]=m.charAt(i-1);
         arr[1]=m.charAt(i);
         System.out.println(arr[0]);
         System.out.println(arr[1]);
        }
      }
      //return arr;
    }
    public static void main(String[] args) {
        System.out.println("enter all elements");

       Scanner sc = new Scanner(System.in);
       String n = sc.nextLine();
       
       xyz(n);
 
    }
}
