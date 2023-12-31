package com.hive.app.modules.notaxipage.`data`.model

import com.hive.app.R
import com.hive.app.appcomponents.di.MyApp
import kotlin.String

data class NoTaxiPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNotaxihere: String? = MyApp.getInstance().resources.getString(R.string.lbl_no_taxi_here)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_sorry_there_s)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTryAgain: String? = MyApp.getInstance().resources.getString(R.string.lbl_try_again)

)
