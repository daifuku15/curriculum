package study;

/**
 * User.java
 */
class User {

    // �t�B�[���h�ϐ�
    private String userName;
    private int id;
    private String password;

    // �R���X�g���N�^
    public User(String userName, int id, String password) {
        this.userName = userName;
        this.id = id;
        this.password = password;
    }

    // �@ �ȉ��̃��[���ɏ]���A�J�E���g���i���O�AID�A�p�X���[�h�j���o�͂��郁�\�b�h���쐬���Ă��������B
    // �A�N�Z�X�C���q:�uprotected�v
    // ���\�b�h��:�uprintAccountInfo�v
    protected void printAccountInfo() {
        System.out.println("���[�U�[����" + userName);
        System.out.println("ID��" + id);
        System.out.println("�p�X���[�h��" + password);
    }

}