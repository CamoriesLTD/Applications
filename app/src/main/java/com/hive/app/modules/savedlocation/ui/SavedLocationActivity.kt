package com.hive.app.modules.savedlocation.ui

import android.view.View
import androidx.activity.viewModels
import com.hive.app.R
import com.hive.app.appcomponents.base.BaseActivity
import com.hive.app.databinding.ActivitySavedLocationBinding
import com.hive.app.modules.savedlocation.`data`.model.SavedLocationRowModel
import com.hive.app.modules.savedlocation.`data`.viewmodel.SavedLocationVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SavedLocationActivity :
    BaseActivity<ActivitySavedLocationBinding>(R.layout.activity_saved_location) {
  private val viewModel: SavedLocationVM by viewModels<SavedLocationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val savedLocationAdapter =
    SavedLocationAdapter(viewModel.savedLocationList.value?:mutableListOf())
    binding.recyclerSavedLocation.adapter = savedLocationAdapter
    savedLocationAdapter.setOnItemClickListener(
    object : SavedLocationAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SavedLocationRowModel) {
        onClickRecyclerSavedLocation(view, position, item)
      }
    }
    )
    viewModel.savedLocationList.observe(this) {
      savedLocationAdapter.updateData(it)
    }
    binding.savedLocationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerSavedLocation(
    view: View,
    position: Int,
    item: SavedLocationRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SAVED_LOCATION_ACTIVITY"

  }
}
