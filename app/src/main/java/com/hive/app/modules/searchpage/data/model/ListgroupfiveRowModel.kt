package com.hive.app.modules.searchpage.`data`.model

import com.hive.app.R
import com.hive.app.appcomponents.di.MyApp
import kotlin.String

data class ListgroupfiveRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtQueenAliaInte: String? =
      MyApp.getInstance().resources.getString(R.string.msg_queen_alia_inte)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlphaBuilding: String? =
      MyApp.getInstance().resources.getString(R.string.msg_alpha_building)

)
