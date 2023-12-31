package com.hive.app.modules.nointernetpage.ui

import androidx.activity.viewModels
import com.hive.app.R
import com.hive.app.appcomponents.base.BaseActivity
import com.hive.app.databinding.ActivityNoInternetPageBinding
import com.hive.app.modules.nointernetpage.`data`.viewmodel.NoInternetPageVM
import kotlin.String
import kotlin.Unit

class NoInternetPageActivity :
    BaseActivity<ActivityNoInternetPageBinding>(R.layout.activity_no_internet_page) {
  private val viewModel: NoInternetPageVM by viewModels<NoInternetPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.noInternetPageVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "NO_INTERNET_PAGE_ACTIVITY"

  }
}
