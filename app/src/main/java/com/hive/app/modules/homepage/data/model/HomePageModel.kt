package com.hive.app.modules.homepage.`data`.model

import com.hive.app.R
import com.hive.app.appcomponents.di.MyApp
import kotlin.String

data class HomePageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWherewouldyou: String? =
      MyApp.getInstance().resources.getString(R.string.msg_where_would_you)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWork: String? = MyApp.getInstance().resources.getString(R.string.lbl_work)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecently: String? = MyApp.getInstance().resources.getString(R.string.lbl_recently)

)
