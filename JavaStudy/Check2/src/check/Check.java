package check;

import constants.Constants;

public class Check {
    
    private static final String firstName = "福地";
    private static final String lastName = "大樹";

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        PrintName(firstName,lastName);
        Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
        pet.introduce();
        RobotPet robotPet= new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
        robotPet.introduce();
        
    }
    
    private static void PrintName(String firstName,String lastName) {
        System.out.println("PrintNameメソッド　→　"+firstName+lastName);
    }

}
