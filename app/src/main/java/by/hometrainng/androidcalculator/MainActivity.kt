package by.hometrainng.androidcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import by.hometrainng.androidcalculator.service.CalcService
import by.hometrainng.androidcalculator.service.ExpressionChecker

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.main_container, CalcFragment(CalcService(), ExpressionChecker()))
                .commit()
        }
    }

    fun addFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.main_container, fragment)
            .addToBackStack(null)
            .commit()
    }
}

fun Fragment.pushFragment(fragment: Fragment) {

    (requireActivity() as MainActivity).addFragment(fragment)

}