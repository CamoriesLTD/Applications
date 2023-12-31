package com.hive.app.modules.searchpage.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hive.app.R
import com.hive.app.databinding.RowListgroupfiveBinding
import com.hive.app.modules.searchpage.`data`.model.ListgroupfiveRowModel
import kotlin.Int
import kotlin.collections.List

class ListgroupfiveAdapter(
  var list: List<ListgroupfiveRowModel>
) : RecyclerView.Adapter<ListgroupfiveAdapter.RowListgroupfiveVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListgroupfiveVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listgroupfive,parent,false)
    return RowListgroupfiveVH(view)
  }

  override fun onBindViewHolder(holder: RowListgroupfiveVH, position: Int) {
    val listgroupfiveRowModel = ListgroupfiveRowModel()
    // TODO uncomment following line after integration with data source
    // val listgroupfiveRowModel = list[position]
    holder.binding.listgroupfiveRowModel = listgroupfiveRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListgroupfiveRowModel>) {
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
      item: ListgroupfiveRowModel
    ) {
    }
  }

  inner class RowListgroupfiveVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListgroupfiveBinding = RowListgroupfiveBinding.bind(itemView)
  }
}
