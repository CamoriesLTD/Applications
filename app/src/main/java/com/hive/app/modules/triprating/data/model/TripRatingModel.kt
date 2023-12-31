package com.hive.app.modules.triprating.`data`.model

import com.hive.app.R
import com.hive.app.appcomponents.di.MyApp
import kotlin.String

data class TripRatingModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAllenGilbert: String? = MyApp.getInstance().resources.getString(R.string.lbl_allen_gilbert)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWritereview: String? = MyApp.getInstance().resources.getString(R.string.lbl_write_review)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupEightyFiveValue: String? = null
)
