package by.hometrainng.androidcalculator.utils

class OperationalList {
    companion object {

        var list = mutableListOf<String>()
            get() = field


        fun addElement(item: String) {
            list.add(item)
        }
    }
}