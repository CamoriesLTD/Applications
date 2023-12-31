package com.hive.app.modules.onboardingthree.`data`.model

import com.hive.app.R
import com.hive.app.appcomponents.di.MyApp
import kotlin.String

data class OnboardingThreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txt2ndSt: String? = MyApp.getInstance().resources.getString(R.string.lbl_2nd_st)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTrackRide: String? = MyApp.getInstance().resources.getString(R.string.lbl_track_ride)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckyourcurr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_curr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGetStarted: String? = MyApp.getInstance().resources.getString(R.string.lbl_get_started)

)
