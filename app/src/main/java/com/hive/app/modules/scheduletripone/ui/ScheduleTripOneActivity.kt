package com.hive.app.modules.scheduletripone.ui

import androidx.activity.viewModels
import com.hive.app.R
import com.hive.app.appcomponents.base.BaseActivity
import com.hive.app.databinding.ActivityScheduleTripOneBinding
import com.hive.app.modules.scheduletripone.`data`.viewmodel.ScheduleTripOneVM
import kotlin.String
import kotlin.Unit

class ScheduleTripOneActivity :
    BaseActivity<ActivityScheduleTripOneBinding>(R.layout.activity_schedule_trip_one) {
  private val viewModel: ScheduleTripOneVM by viewModels<ScheduleTripOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.scheduleTripOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "SCHEDULE_TRIP_ONE_ACTIVITY"

  }
}
