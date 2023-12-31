package com.hive.app.modules.searchpage.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hive.app.R
import com.hive.app.databinding.RowListgroupeightBinding
import com.hive.app.modules.searchpage.`data`.model.ListgroupeightRowModel
import kotlin.Int
import kotlin.collections.List

class ListgroupeightAdapter(
  var list: List<ListgroupeightRowModel>
) : RecyclerView.Adapter<ListgroupeightAdapter.RowListgroupeightVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListgroupeightVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listgroupeight,parent,false)
    return RowListgroupeightVH(view)
  }

  override fun onBindViewHolder(holder: RowListgroupeightVH, position: Int) {
    val listgroupeightRowModel = ListgroupeightRowModel()
    // TODO uncomment following line after integration with data source
    // val listgroupeightRowModel = list[position]
    holder.binding.listgroupeightRowModel = listgroupeightRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListgroupeightRowModel>) {
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
      item: ListgroupeightRowModel
    ) {
    }
  }

  inner class RowListgroupeightVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListgroupeightBinding = RowListgroupeightBinding.bind(itemView)
  }
}
