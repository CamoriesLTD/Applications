package com.hive.app.modules.mytrips.ui

import androidx.activity.viewModels
import com.hive.app.R
import com.hive.app.appcomponents.base.BaseActivity
import com.hive.app.databinding.ActivityMyTripsBinding
import com.hive.app.modules.mytrips.`data`.viewmodel.MyTripsVM
import kotlin.String
import kotlin.Unit

class MyTripsActivity : BaseActivity<ActivityMyTripsBinding>(R.layout.activity_my_trips) {
  private val viewModel: MyTripsVM by viewModels<MyTripsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.myTripsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "MY_TRIPS_ACTIVITY"

  }
}
