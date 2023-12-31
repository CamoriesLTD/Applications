package com.hive.app.modules.scheduletriptwo.ui

import androidx.activity.viewModels
import com.hive.app.R
import com.hive.app.appcomponents.base.BaseActivity
import com.hive.app.databinding.ActivityScheduleTripTwoBinding
import com.hive.app.modules.scheduletriptwo.`data`.viewmodel.ScheduleTripTwoVM
import kotlin.String
import kotlin.Unit

class ScheduleTripTwoActivity :
    BaseActivity<ActivityScheduleTripTwoBinding>(R.layout.activity_schedule_trip_two) {
  private val viewModel: ScheduleTripTwoVM by viewModels<ScheduleTripTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scheduleTripTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCHEDULE_TRIP_TWO_ACTIVITY"

  }
}
