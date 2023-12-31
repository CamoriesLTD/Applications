package com.hive.app.modules.searchpage.`data`.model

import com.hive.app.R
import com.hive.app.appcomponents.di.MyApp
import kotlin.String

data class SearchPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFrom: String? = MyApp.getInstance().resources.getString(R.string.lbl_from)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCurrentlocatio: String? =
      MyApp.getInstance().resources.getString(R.string.msg_current_locatio)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTo: String? = MyApp.getInstance().resources.getString(R.string.lbl_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEnterDestinati: String? =
      MyApp.getInstance().resources.getString(R.string.msg_enter_destinati)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAllSavedLocat: String? =
      MyApp.getInstance().resources.getString(R.string.msg_all_saved_locat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecentlocation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_recent_location)

)
