package jp.techacademy.kenichi04.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var taro = Human("taro", 10, "game")
        var jiro = Human("jiro", 15, "soccer")

        taro.say()
        taro.think()
        jiro.say()
        jiro.think()

    }

}