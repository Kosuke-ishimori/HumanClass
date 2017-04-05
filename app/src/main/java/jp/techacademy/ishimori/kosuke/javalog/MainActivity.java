package jp.techacademy.ishimori.kosuke.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;    // ここを追加

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("こうすけ", 27, "読書");     // 名前をこうすけ、年齢27歳で、Humanのインスタンスを作る

        human.say();

        human.think();

    }

}