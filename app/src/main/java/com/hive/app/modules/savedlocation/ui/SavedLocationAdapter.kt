package com.hive.app.modules.savedlocation.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hive.app.R
import com.hive.app.databinding.RowSavedLocationBinding
import com.hive.app.modules.savedlocation.`data`.model.SavedLocationRowModel
import kotlin.Int
import kotlin.collections.List

class SavedLocationAdapter(
  var list: List<SavedLocationRowModel>
) : RecyclerView.Adapter<SavedLocationAdapter.RowSavedLocationVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSavedLocationVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_saved_location,parent,false)
    return RowSavedLocationVH(view)
  }

  override fun onBindViewHolder(holder: RowSavedLocationVH, position: Int) {
    val savedLocationRowModel = SavedLocationRowModel()
    // TODO uncomment following line after integration with data source
    // val savedLocationRowModel = list[position]
    holder.binding.savedLocationRowModel = savedLocationRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SavedLocationRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: SavedLocationRowModel
    ) {
    }
  }

  inner class RowSavedLocationVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowSavedLocationBinding = RowSavedLocationBinding.bind(itemView)
  }
}
