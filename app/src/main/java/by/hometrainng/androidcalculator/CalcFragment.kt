package by.hometrainng.androidcalculator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import by.hometrainng.androidcalculator.databinding.FragmentCalculatorBinding
import by.hometrainng.androidcalculator.service.CalcService
import by.hometrainng.androidcalculator.service.ExpressionChecker
import by.hometrainng.androidcalculator.utils.OperationalList

class CalcFragment(
    private val calcService: CalcService,
    private val expressionChecker: ExpressionChecker
    ): Fragment() {

    private var _binding: FragmentCalculatorBinding? = null
    private val binding get() = requireNotNull(_binding)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return FragmentCalculatorBinding.inflate(inflater, container, false)
            .also { _binding = it }
            .root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            var textToCalc = StringBuilder("")

            button0.setOnClickListener { 
                textView.text = textToCalc.append("0")
            }
            button1.setOnClickListener { 
                textView.text = textToCalc.append("1")
            }
            button2.setOnClickListener { 
                textView.text = textToCalc.append("2")
            }
            button3.setOnClickListener { 
                textView.text = textToCalc.append("3")
            }
            button4.setOnClickListener { 
                textView.text = textToCalc.append("4")
            }
            button5.setOnClickListener { 
                textView.text = textToCalc.append("5")
            }
            button6.setOnClickListener { 
                textView.text = textToCalc.append("6")
            }
            button7.setOnClickListener { 
                textView.text = textToCalc.append("7")
            }
            button8.setOnClickListener { 
                textView.text = textToCalc.append("8")
            }   
            button9.setOnClickListener { 
                textView.text = textToCalc.append("9")
            }
            buttonPlus.setOnClickListener {
                textView.text = textToCalc.append("+")
            }
            buttonMinus.setOnClickListener {
                textView.text = textToCalc.append("-")
            }
            buttonMultiply.setOnClickListener {
                textView.text = textToCalc.append("*")
            }
            buttonDivision.setOnClickListener {
                textView.text = textToCalc.append("/")
            }
            buttonDelete.setOnClickListener {
                textToCalc = StringBuilder("")
                textView.text = textToCalc
            }
/*            setExpressionButton.setOnClickListener {
                textView.text = calcService.calc(textInput.text.toString())
            }*/
            buttonEquals.setOnClickListener {
                if (expressionChecker.checkExpression(textToCalc)) {
                    val result = calcService.calc(textView.text.toString())
                    textView.text = result
                    OperationalList.addElement(textToCalc.append("=").append(result).toString())
                    textToCalc = StringBuilder("")
                }
                else {
                    textToCalc = StringBuilder("")
                    textView.text = textToCalc
                    Toast.makeText(root.context, "Wrong expression", Toast.LENGTH_SHORT).show()
                }
            }
            buttonHistory.setOnClickListener {
                pushFragment(ListFragment())
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}