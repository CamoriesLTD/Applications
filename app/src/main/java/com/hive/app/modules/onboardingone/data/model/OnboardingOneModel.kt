package com.hive.app.modules.onboardingone.`data`.model

import com.hive.app.R
import com.hive.app.appcomponents.di.MyApp
import kotlin.String

data class OnboardingOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRequestRide: String? = MyApp.getInstance().resources.getString(R.string.lbl_request_ride)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRequestaride: String? =
      MyApp.getInstance().resources.getString(R.string.msg_request_a_ride)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGetStarted: String? = MyApp.getInstance().resources.getString(R.string.lbl_get_started)

)
