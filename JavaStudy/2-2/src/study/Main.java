package study;

/**
 * Main.java
 *
 * 本課題では、mainメソッド・インスタンス・メソッドの呼び出しの使い方を学んでいきましょう。
 * 課題範囲は以下のとおりです。
 *   User.java: 問�@
 *   Main.java: 問�@から問�A
 * 指定された値と変数名を守って記述してください。
 *
 */
public class Main {

    public static void main(String[] args) {

        // �@ 以下のルールに従いUserクラスのインスタンスを生成してください。
        // 変数名:「user」
        User user = new User("hoge",123,"abc123");
        // �A �@のインスタンス変数より、アカウント情報をコンソール出力するメソッドを呼び出しなさい。
        user.printAccountInfo();
    }
}
 