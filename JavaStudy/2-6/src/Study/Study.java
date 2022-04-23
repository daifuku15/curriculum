package Study;

import java.time.Year;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * 本課題では、基本的な日付操作クラスの使い方を学びましょう。
 *
 * 問�@から問�Bまであります。
 * 問�Aに関しては、コメントを記述してください。
 *
 * ※この課題に関しては課題実施日によって結果が異なるため、出力結果が個々で異なります。
 */
public class Study {

    public static void main(String args[]) {

        // Dateクラスのインスタンスを生成
        Date now = new Date();

        // 問�@ ローカル変数「now」を使用し、本日の日付を表示してください。
        System.out.println(now);
        // Calendarクラスのインスタンスを生成
        Calendar calendar = Calendar.getInstance();

        // 問�A 「(Calendar.MONTH) + 数値」の処理は、想定していない値となる可能性があります。
        // その理由をコメントへ記述してください。
        // [ここへ記述]
        //Calendar.MONTHにセットされた値に対して数値計算を行うと
        //繰り上げを行う必要があるときに行われずそのまま値が加算されてしまう
        //
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH) + 1);
        System.out.println(calendar.get(Calendar.DATE));
        // 問�B 上記の「calendar」を使用し、本日から1年2ヶ月15日先の日付を表示しなさい。
        // - この課題に関しては課題実施日によって結果が異なりますので、Wiki課題の画像とは結果が異なります。
        // - また、うるう年の場合は設定内容が正しくとも日付がズレて表示される可能性があります。
        
        calendar.add(Calendar.YEAR,1);
        System.out.println(calendar.get(Calendar.YEAR));
        calendar.add(Calendar.MONTH, 1);
        calendar.add(Calendar.MONTH, 2);
        System.out.println(calendar.get(Calendar.MONTH));
        calendar.add(Calendar.DATE, 15);
        System.out.println(calendar.get(Calendar.DATE));

        // うるう年判定
        printLeapYear(calendar.get(Calendar.YEAR));
    }

    /**
     * うるう年判定
     * 問�Bで日付がズレる可能性があるため補足として出力
     * @param year
     */
    private static void printLeapYear(final int year) {
        System.out.println(year + "年は、うるう年" + (Year.isLeap(year) ? "です。" : "ではありません。"));
    }
}