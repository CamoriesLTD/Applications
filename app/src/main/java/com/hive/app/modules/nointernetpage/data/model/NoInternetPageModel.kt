package com.hive.app.modules.nointernetpage.`data`.model

import com.hive.app.R
import com.hive.app.appcomponents.di.MyApp
import kotlin.String

data class NoInternetPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNointernet: String? = MyApp.getInstance().resources.getString(R.string.lbl_no_internet)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPleaserefreash: String? =
      MyApp.getInstance().resources.getString(R.string.msg_please_refreash)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTryAgain: String? = MyApp.getInstance().resources.getString(R.string.lbl_try_again)

)
