package check;

import constants.Constants;

public class Check {
    
    private static final String firstName = "���n";
    private static final String lastName = "���";

    public static void main(String[] args) {
        // TODO �����������ꂽ���\�b�h�E�X�^�u
        PrintName(firstName,lastName);
        Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
        pet.introduce();
        RobotPet robotPet= new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
        robotPet.introduce();
        
    }
    
    private static void PrintName(String firstName,String lastName) {
        System.out.println("PrintName���\�b�h�@���@"+firstName+lastName);
    }

}
