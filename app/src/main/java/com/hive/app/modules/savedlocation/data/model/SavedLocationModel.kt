package com.hive.app.modules.savedlocation.`data`.model

import com.hive.app.R
import com.hive.app.appcomponents.di.MyApp
import kotlin.String

data class SavedLocationModel(
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

)
