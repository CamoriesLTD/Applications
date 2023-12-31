package com.hive.app.modules.scheduletripone.`data`.model

import com.hive.app.R
import com.hive.app.appcomponents.di.MyApp
import kotlin.String

data class ScheduleTripOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtScheduleTrip: String? = MyApp.getInstance().resources.getString(R.string.lbl_schedule_trip)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWedAugustNineteen: String? =
      MyApp.getInstance().resources.getString(R.string.msg_wed_august_19)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThuAugustTwenty: String? =
      MyApp.getInstance().resources.getString(R.string.msg_thu_august_20)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFriAugustTwentyOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_fri_august_21)

)
