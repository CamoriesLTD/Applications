package com.hive.app.modules.myprofile.ui

import androidx.activity.viewModels
import com.hive.app.R
import com.hive.app.appcomponents.base.BaseActivity
import com.hive.app.databinding.ActivityMyProfileBinding
import com.hive.app.modules.myprofile.`data`.viewmodel.MyProfileVM
import kotlin.String
import kotlin.Unit

class MyProfileActivity : BaseActivity<ActivityMyProfileBinding>(R.layout.activity_my_profile) {
  private val viewModel: MyProfileVM by viewModels<MyProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.myProfileVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "MY_PROFILE_ACTIVITY"

  }
}
