package by.hometrainng.androidcalculator.utils

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import by.hometrainng.androidcalculator.databinding.ItemExpressionBinding

class ItemsAdapter(private val items: List<String>) : RecyclerView.Adapter<ItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ItemViewHolder(
            binding = ItemExpressionBinding.inflate(layoutInflater, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

}

class ItemViewHolder(
    private val binding: ItemExpressionBinding
    ) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: String) {
        binding.textOfExpression.text = item
    }

}