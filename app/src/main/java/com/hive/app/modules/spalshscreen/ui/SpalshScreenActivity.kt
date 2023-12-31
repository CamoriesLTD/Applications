package com.hive.app.modules.spalshscreen.ui

import androidx.activity.viewModels
import com.hive.app.R
import com.hive.app.appcomponents.base.BaseActivity
import com.hive.app.databinding.ActivitySpalshScreenBinding
import com.hive.app.modules.spalshscreen.`data`.viewmodel.SpalshScreenVM
import kotlin.String
import kotlin.Unit

class SpalshScreenActivity :
    BaseActivity<ActivitySpalshScreenBinding>(R.layout.activity_spalsh_screen) {
  private val viewModel: SpalshScreenVM by viewModels<SpalshScreenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.spalshScreenVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SPALSH_SCREEN_ACTIVITY"

  }
}
