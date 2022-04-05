package by.hometrainng.androidcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import by.hometrainng.androidcalculator.service.CalcService
import by.hometrainng.androidcalculator.service.ExpressionChecker

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.main_container, CalcFragment(CalcService(), ExpressionChecker()))
            .commit()
    }
}