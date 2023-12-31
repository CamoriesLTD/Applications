package com.hive.app.modules.savedlocationremove.ui

import android.view.View
import androidx.activity.viewModels
import com.hive.app.R
import com.hive.app.appcomponents.base.BaseActivity
import com.hive.app.databinding.ActivitySavedLocationRemoveBinding
import com.hive.app.modules.savedlocationremove.`data`.model.ListgroupfiftyoneRowModel
import com.hive.app.modules.savedlocationremove.`data`.viewmodel.SavedLocationRemoveVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SavedLocationRemoveActivity :
    BaseActivity<ActivitySavedLocationRemoveBinding>(R.layout.activity_saved_location_remove) {
  private val viewModel: SavedLocationRemoveVM by viewModels<SavedLocationRemoveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listgroupfiftyoneAdapter =
    ListgroupfiftyoneAdapter(viewModel.listgroupfiftyoneList.value?:mutableListOf())
    binding.recyclerListgroupfiftyone.adapter = listgroupfiftyoneAdapter
    listgroupfiftyoneAdapter.setOnItemClickListener(
    object : ListgroupfiftyoneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListgroupfiftyoneRowModel) {
        onClickRecyclerListgroupfiftyone(view, position, item)
      }
    }
    )
    viewModel.listgroupfiftyoneList.observe(this) {
      listgroupfiftyoneAdapter.updateData(it)
    }
    binding.savedLocationRemoveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListgroupfiftyone(
    view: View,
    position: Int,
    item: ListgroupfiftyoneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SAVED_LOCATION_REMOVE_ACTIVITY"

  }
}
