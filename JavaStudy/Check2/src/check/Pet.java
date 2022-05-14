package check;

public class Pet {

    private String name;
    private String masterName;

    public Pet(String name, String masterName) {
        this.name = name;
        this.masterName = masterName;
    }

    protected String getName() {
        return name;
    }

    protected String getMasterName() {
        return masterName;
    }

    public void introduce() {
        System.out.println("���l�̖��O��" + this.name + "�ł�");
        System.out.println("������l�l��" + this.masterName + "�ł�");
    }
}

class RobotPet extends Pet {
    public RobotPet(String name, String masterName) {
        super(name, masterName);
    }

    public void introduce() {
        System.out.println("�����̓��{�b�g�B���O��" + super.getName() + "�B");
        System.out.println("������l�l��" + super.getMasterName() + "�B");
    }
}