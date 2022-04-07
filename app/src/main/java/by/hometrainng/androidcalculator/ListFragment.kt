package by.hometrainng.androidcalculator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import by.hometrainng.androidcalculator.databinding.FragmentListBinding
import by.hometrainng.androidcalculator.utils.ItemsAdapter
import by.hometrainng.androidcalculator.utils.OperationalList

class ListFragment: Fragment() {

    private var _binding: FragmentListBinding? = null
    private val binding get() = requireNotNull(_binding)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return FragmentListBinding.inflate(inflater, container, false)
            .also { _binding = it }
            .root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            listOfOperations.layoutManager = LinearLayoutManager(view.context)

            listOfOperations.adapter = ItemsAdapter(OperationalList.getList())
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}