package check;

import constants.Constants;

public class Check {
    
    private static final String firstName = "福地";
    private static final String lastName = "大樹";

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        PrintName(firstName,lastName);
        Constants constants = new Constants();
        Pet pet = new Pet(constants.CHECK_CLASS_JAVA,constants.CHECK_CLASS_HOGE);
        pet.introduce();
        RobotPet robotPet= new RobotPet(constants.CHECK_CLASS_R2D2,constants.CHECK_CLASS_LUKE);
        robotPet.introduce();
        
    }
    
    private static void PrintName(String firstName,String lastName) {
        System.out.println("PrintNameメソッド　→　"+firstName+lastName);
    }

}
