package Study;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * �{�ۑ�ł́A��{�I�ȓ��t����N���X�̎g�������w�т܂��傤�B
 *
 * ��@�����B�܂ł���܂��B
 * ��A�Ɋւ��ẮA�R�����g���L�q���Ă��������B
 *
 * �����̉ۑ�Ɋւ��Ă͉ۑ���{���ɂ���Č��ʂ��قȂ邽�߁A�o�͌��ʂ��X�ňقȂ�܂��B
 */
public class Study {

    public static void main(String args[]) {

        // Date�N���X�̃C���X�^���X�𐶐�
        Date now = new Date();

        // ��@ ���[�J���ϐ��unow�v���g�p���A�{���̓��t��\�����Ă��������B
        System.out.println(now);
        // Calendar�N���X�̃C���X�^���X�𐶐�
        Calendar calendar = Calendar.getInstance();

        // ��A �u(Calendar.MONTH) + ���l�v�̏����́A�z�肵�Ă��Ȃ��l�ƂȂ�\��������܂��B
        // ���̗��R���R�����g�֋L�q���Ă��������B
        // [�����֋L�q]
        //Calendar.MONTH�ɃZ�b�g���ꂽ�l�ɑ΂��Đ��l�v�Z���s����
        //�J��グ���s���K�v������Ƃ��ɍs��ꂸ���̂܂ܒl�����Z����Ă��܂�
        //
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH) + 1);
        System.out.println(calendar.get(Calendar.DATE));
        // ��B ��L�́ucalendar�v���g�p���A�{������1�N2����15����̓��t��\�����Ȃ����B
        // - ���̉ۑ�Ɋւ��Ă͉ۑ���{���ɂ���Č��ʂ��قȂ�܂��̂ŁAWiki�ۑ�̉摜�Ƃ͌��ʂ��قȂ�܂��B
        // - �܂��A���邤�N�̏ꍇ�͐ݒ���e���������Ƃ����t���Y���ĕ\�������\��������܂��B
        
        calendar.add(Calendar.YEAR,1);
        System.out.println(calendar.get(Calendar.YEAR));
        calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.MONTH, 2);
        System.out.println(calendar.get(Calendar.MONTH));
        calendar.add(Calendar.DATE, 15);
        System.out.println(calendar.get(Calendar.DATE));

        // ���邤�N����
        printLeapYear(calendar.get(Calendar.YEAR));
    }

    /**
     * ���邤�N����
     * ��B�œ��t���Y����\�������邽�ߕ⑫�Ƃ��ďo��
     * @param year
     */
    private static void printLeapYear(final int year) {
        System.out.println(year + "�N�́A���邤�N" + (Year.isLeap(year) ? "�ł��B" : "�ł͂���܂���B"));
    }
}