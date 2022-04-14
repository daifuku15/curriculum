package chapter1;

import java.util.Scanner;

public class Ex1 {
    public static String _empId;
    public static String _department;
    
    public Ex1(String empId, String department) {
        System.out.println(empId);
        System.out.println(department);
   }
    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        Scanner scan = new Scanner(System.in);
        System.out.println("Idを入力してください:");
       String  scan1 = scan.next();
        System.out.println("部門を入力してください:");
        String scan2 = scan.next();
        scan.close();
        
        new Ex1(scan1,scan2);
    }
    

}
