package com.hive.app.modules.savedlocation.`data`.model

import com.hive.app.R
import com.hive.app.appcomponents.di.MyApp
import kotlin.String

data class SavedLocationRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWork: String? = MyApp.getInstance().resources.getString(R.string.lbl_work)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeburl: String? = MyApp.getInstance().resources.getString(R.string.lbl_mawdoo3_com)

)
