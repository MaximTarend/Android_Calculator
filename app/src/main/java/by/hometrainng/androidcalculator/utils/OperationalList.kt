package by.hometrainng.androidcalculator.utils

object OperationalList {

    private var list = mutableListOf<String>()

    fun addElement(item: String) {
        list.add(item)
    }

    fun getList() : List<String> {
        return list
    }

}
