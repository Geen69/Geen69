import java.util.Scanner;
public class NewClass6 {
    public static void main(String[] args){
        int m []=new int[5];
        inputAll(m);
        println(m);
     }
    public static void println(int m[]){
        Scanner obj = new Scanner(System.in);
        for(int i=0;i<m.length;i++){
            System.out.println("input the number:");
            m[i]=obj.nextInt();
}    
}
    private static void inputAll(int[] m) {
    } 
}
