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
        // TODO �����������ꂽ���\�b�h�E�X�^�u
        Scanner scan = new Scanner(System.in);
        System.out.println("Id����͂��Ă�������:");
       String  scan1 = scan.next();
        System.out.println("�������͂��Ă�������:");
        String scan2 = scan.next();
        scan.close();
        
        new Ex1(scan1,scan2);
    }
    

}
