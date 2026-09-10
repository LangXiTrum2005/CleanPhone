package com.example.cleanapp.ui.language

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.cleanapp.R
import com.example.cleanapp.databinding.ItemLanguageBinding

class LanguageAdapter(
    private val languages: List<LanguageItem>,
    private var selectedCode: String,
    private val onLanguageSelected: (LanguageItem) -> Unit
) : RecyclerView.Adapter<LanguageAdapter.LanguageViewHolder>() {

    fun setSelectedCode(code: String) {
        selectedCode = code
        notifyDataSetChanged()
    }

    fun getSelectedCode(): String = selectedCode

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageViewHolder {
        val binding = ItemLanguageBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return LanguageViewHolder(binding)
    }

    override fun onBindViewHolder(holder: LanguageViewHolder, position: Int) {
        holder.bind(languages[position])
    }

    override fun getItemCount(): Int = languages.size

    inner class LanguageViewHolder(
        private val binding: ItemLanguageBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: LanguageItem) {
            binding.tvFlag.text = item.flag
            binding.tvNativeName.text = item.nativeName
            binding.tvEnglishName.text = item.englishName

            val isSelected = item.code.equals(selectedCode, ignoreCase = true)
            binding.rbLanguage.isChecked = isSelected

            val context = binding.root.context
            if (isSelected) {
                binding.cardLanguage.strokeColor = ContextCompat.getColor(context, R.color.primary_glow)
                binding.cardLanguage.strokeWidth = 4
                binding.cardLanguage.setCardBackgroundColor(ContextCompat.getColor(context, R.color.bg_card_highlight))
            } else {
                binding.cardLanguage.strokeColor = ContextCompat.getColor(context, R.color.border_subtle)
                binding.cardLanguage.strokeWidth = 2
                binding.cardLanguage.setCardBackgroundColor(ContextCompat.getColor(context, R.color.bg_card))
            }

            binding.cardLanguage.setOnClickListener {
                selectedCode = item.code
                notifyDataSetChanged()
                onLanguageSelected(item)
            }
        }
    }
}
