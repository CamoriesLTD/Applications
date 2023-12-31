package com.hive.app.modules.selecttrip.ui

import androidx.activity.viewModels
import com.hive.app.R
import com.hive.app.appcomponents.base.BaseActivity
import com.hive.app.databinding.ActivitySelectTripBinding
import com.hive.app.modules.selecttrip.`data`.viewmodel.SelectTripVM
import kotlin.String
import kotlin.Unit

class SelectTripActivity : BaseActivity<ActivitySelectTripBinding>(R.layout.activity_select_trip) {
  private val viewModel: SelectTripVM by viewModels<SelectTripVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.selectTripVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SELECT_TRIP_ACTIVITY"

  }
}
