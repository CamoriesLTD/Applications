package com.hive.app.modules.searchpage.ui

import android.view.View
import androidx.activity.viewModels
import com.hive.app.R
import com.hive.app.appcomponents.base.BaseActivity
import com.hive.app.databinding.ActivitySearchPageBinding
import com.hive.app.modules.searchpage.`data`.model.ListgroupeightRowModel
import com.hive.app.modules.searchpage.`data`.model.ListgroupfiveRowModel
import com.hive.app.modules.searchpage.`data`.viewmodel.SearchPageVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SearchPageActivity : BaseActivity<ActivitySearchPageBinding>(R.layout.activity_search_page) {
  private val viewModel: SearchPageVM by viewModels<SearchPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listgroupeightAdapter =
    ListgroupeightAdapter(viewModel.listgroupeightList.value?:mutableListOf())
    binding.recyclerListgroupeight.adapter = listgroupeightAdapter
    listgroupeightAdapter.setOnItemClickListener(
    object : ListgroupeightAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListgroupeightRowModel) {
        onClickRecyclerListgroupeight(view, position, item)
      }
    }
    )
    viewModel.listgroupeightList.observe(this) {
      listgroupeightAdapter.updateData(it)
    }
    val listgroupfiveAdapter =
    ListgroupfiveAdapter(viewModel.listgroupfiveList.value?:mutableListOf())
    binding.recyclerListgroupfive.adapter = listgroupfiveAdapter
    listgroupfiveAdapter.setOnItemClickListener(
    object : ListgroupfiveAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListgroupfiveRowModel) {
        onClickRecyclerListgroupfive(view, position, item)
      }
    }
    )
    viewModel.listgroupfiveList.observe(this) {
      listgroupfiveAdapter.updateData(it)
    }
    binding.searchPageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListgroupeight(
    view: View,
    position: Int,
    item: ListgroupeightRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListgroupfive(
    view: View,
    position: Int,
    item: ListgroupfiveRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SEARCH_PAGE_ACTIVITY"

  }
}
