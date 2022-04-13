package by.hometrainng.androidcalculator.utils

object OperationalList { // TODO реализовать передачу через bundle

    private var list = mutableListOf<String>()

    fun addElement(item: String) {
        list.add(item)
    }

    fun getList() : List<String> {
        return list
    }

}
