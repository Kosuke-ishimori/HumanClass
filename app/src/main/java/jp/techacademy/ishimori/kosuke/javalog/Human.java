package jp.techacademy.ishimori.kosuke.javalog;

import android.util.Log;

class Human extends Animal implements Thinkable {
    // クラス変数
    static String to_jp = "ヒト";

    // メンバ変数
    String name;  // 名前
    int age;    // 年齢
    String hobby; // 趣味

    // コンストラクタ
    public Human(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    // クラス関数
    public static void introduce() {
        Log.d("javatest", "これはヒトクラスです。");
    }

    // メンバ関数
    public void say() {
        Log.d("javatest", "私の名前は" + this.name + "です。");
        Log.d("javatest", "年齢は" + this.age + "歳です。");
    }

    @Override
    public void think() {
        Log.d("javatest", "私は" + hobby + "について考える。");
    }
}