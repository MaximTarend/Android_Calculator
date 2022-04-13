package by.hometrainng.androidcalculator.service

import by.hometrainng.androidcalculator.utils.Patterns

class ExpressionChecker {

    fun checkExpression(expression: StringBuilder) : Boolean {
        return expression.matches(Patterns.EXPRESSION.toRegex())
    }
}