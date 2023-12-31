package com.hive.app.modules.meetdriver.`data`.model

import com.hive.app.R
import com.hive.app.appcomponents.di.MyApp
import kotlin.String

data class MeetDriverModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMeetDriver: String? = MyApp.getInstance().resources.getString(R.string.lbl_meet_driver)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThedriverish: String? =
      MyApp.getInstance().resources.getString(R.string.msg_the_driver_is_h)

)
