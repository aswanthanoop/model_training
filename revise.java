import java.util.*;


public class revise {
    public static int add(int x, int y){
            int z = x + y;
            return z;
        }
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number : ");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number : ");
        int b = sc.nextInt();
        sc.close();
        System.out.println(add(a,b));
    }
}