package com.hive.app.modules.savedlocationremove.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.hive.app.R
import com.hive.app.databinding.RowListgroupfiftyoneBinding
import com.hive.app.modules.savedlocationremove.`data`.model.ListgroupfiftyoneRowModel
import kotlin.Int
import kotlin.collections.List

class ListgroupfiftyoneAdapter(
  var list: List<ListgroupfiftyoneRowModel>
) : RecyclerView.Adapter<ListgroupfiftyoneAdapter.RowListgroupfiftyoneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListgroupfiftyoneVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listgroupfiftyone,parent,false)
    return RowListgroupfiftyoneVH(view)
  }

  override fun onBindViewHolder(holder: RowListgroupfiftyoneVH, position: Int) {
    val listgroupfiftyoneRowModel = ListgroupfiftyoneRowModel()
    // TODO uncomment following line after integration with data source
    // val listgroupfiftyoneRowModel = list[position]
    holder.binding.listgroupfiftyoneRowModel = listgroupfiftyoneRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListgroupfiftyoneRowModel>) {
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
      item: ListgroupfiftyoneRowModel
    ) {
    }
  }

  inner class RowListgroupfiftyoneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListgroupfiftyoneBinding = RowListgroupfiftyoneBinding.bind(itemView)
  }
}
