package com.hive.app.modules.locationpage.ui

import androidx.activity.viewModels
import com.hive.app.R
import com.hive.app.appcomponents.base.BaseActivity
import com.hive.app.databinding.ActivityLocationPageBinding
import com.hive.app.modules.locationpage.`data`.viewmodel.LocationPageVM
import kotlin.String
import kotlin.Unit

class LocationPageActivity :
    BaseActivity<ActivityLocationPageBinding>(R.layout.activity_location_page) {
  private val viewModel: LocationPageVM by viewModels<LocationPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.locationPageVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "LOCATION_PAGE_ACTIVITY"

  }
}
