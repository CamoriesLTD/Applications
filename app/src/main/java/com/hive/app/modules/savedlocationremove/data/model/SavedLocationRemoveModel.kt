package com.hive.app.modules.savedlocationremove.`data`.model

import com.hive.app.R
import com.hive.app.appcomponents.di.MyApp
import kotlin.String

data class SavedLocationRemoveModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSavedLocation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_saved_location)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountry: String? = MyApp.getInstance().resources.getString(R.string.lbl_jerash_jordan)
  ,
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
