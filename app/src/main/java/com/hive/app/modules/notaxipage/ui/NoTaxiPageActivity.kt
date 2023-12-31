package com.hive.app.modules.notaxipage.ui

import androidx.activity.viewModels
import com.hive.app.R
import com.hive.app.appcomponents.base.BaseActivity
import com.hive.app.databinding.ActivityNoTaxiPageBinding
import com.hive.app.modules.notaxipage.`data`.viewmodel.NoTaxiPageVM
import kotlin.String
import kotlin.Unit

class NoTaxiPageActivity : BaseActivity<ActivityNoTaxiPageBinding>(R.layout.activity_no_taxi_page) {
  private val viewModel: NoTaxiPageVM by viewModels<NoTaxiPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.noTaxiPageVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "NO_TAXI_PAGE_ACTIVITY"

  }
}
