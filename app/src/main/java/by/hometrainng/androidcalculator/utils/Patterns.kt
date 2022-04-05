package by.hometrainng.androidcalculator.utils

class Patterns private constructor(){
    companion object {

        const val SPACES = " "
        const val EXPRESSION: String = "([0-9]+[-+/*]{1}[0-9]+)([-+/*]{1}[0-9]+)*"
        const val BRACES = "("
        const val OPERATIONS = "[-+/*]"
    }
}