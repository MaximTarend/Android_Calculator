package by.hometrainng.androidcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import by.hometrainng.androidcalculator.service.CalcService
import by.hometrainng.androidcalculator.service.ExpressionChecker

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addFragment(CalcFragment(CalcService(), ExpressionChecker()))
    }

    fun addFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.main_container, fragment)
            .addToBackStack(null)
            .commit()
    }
}

fun Fragment.pushFragment() {

    (requireActivity() as MainActivity).addFragment(ListFragment())

}