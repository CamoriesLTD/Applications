package com.hive.app.modules.triprating.ui

import android.content.Context
import androidx.fragment.app.viewModels
import com.hive.app.R
import com.hive.app.appcomponents.base.BaseDialogFragment
import com.hive.app.databinding.DialogTripRatingBinding
import com.hive.app.modules.triprating.`data`.viewmodel.TripRatingVM
import kotlin.String
import kotlin.Unit

class TripRatingDialog : BaseDialogFragment<DialogTripRatingBinding>(R.layout.dialog_trip_rating) {
  private val viewModel: TripRatingVM by viewModels<TripRatingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.tripRatingVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "TRIP_RATING_DIALOG"

  }
}
