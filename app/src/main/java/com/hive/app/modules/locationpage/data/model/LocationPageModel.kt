package com.hive.app.modules.locationpage.`data`.model

import com.hive.app.R
import com.hive.app.appcomponents.di.MyApp
import kotlin.String

data class LocationPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNeedyourlocat: String? =
      MyApp.getInstance().resources.getString(R.string.msg_need_your_locat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPleaseturnon: String? =
      MyApp.getInstance().resources.getString(R.string.msg_please_turn_on)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAccessLocation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_access_location)

)
