package com.hive.app.modules.scheduletriptwo.`data`.model

import com.hive.app.R
import com.hive.app.appcomponents.di.MyApp
import kotlin.String

data class ScheduleTripTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtScheduleTrip: String? = MyApp.getInstance().resources.getString(R.string.lbl_schedule_trip)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_16_30)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_17_00)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_17_30)

)
