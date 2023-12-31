package com.hive.app.modules.onboardingtwo.`data`.model

import com.hive.app.R
import com.hive.app.appcomponents.di.MyApp
import kotlin.String

data class OnboardingTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmRide: String? = MyApp.getInstance().resources.getString(R.string.lbl_confirm_ride)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGetStarted: String? = MyApp.getInstance().resources.getString(R.string.lbl_get_started)

)
