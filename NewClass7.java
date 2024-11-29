import java.util.Scanner;
public class NewClass7 {
    public static void main(String[] args){
        Student m[]=new Student[3];
        Scanner obj = new Scanner(System.in);
        for(int i=0;i<m.length;i++){
        System.out.println("input student id name major:");
        m[i]=new Student(obj.nextInt(),obj.next(),obj.next());
        }
        for(int i=0;i<m.length;i++){
        System.out.println(m[i]+ " ");
}
    }
}