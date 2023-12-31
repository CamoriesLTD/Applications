package com.hive.app.modules.meetdriver.ui

import android.content.Context
import androidx.fragment.app.viewModels
import com.hive.app.R
import com.hive.app.appcomponents.base.BaseDialogFragment
import com.hive.app.databinding.DialogMeetDriverBinding
import com.hive.app.modules.meetdriver.`data`.viewmodel.MeetDriverVM
import kotlin.String
import kotlin.Unit

class MeetDriverDialog : BaseDialogFragment<DialogMeetDriverBinding>(R.layout.dialog_meet_driver) {
  private val viewModel: MeetDriverVM by viewModels<MeetDriverVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.meetDriverVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "MEET_DRIVER_DIALOG"

  }
}
