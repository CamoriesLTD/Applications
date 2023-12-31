package com.hive.app.modules.myprofile.`data`.model

import com.hive.app.R
import com.hive.app.appcomponents.di.MyApp
import kotlin.String

data class MyProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMyProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUserName: String? = MyApp.getInstance().resources.getString(R.string.lbl_tanya_robinson)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMytrips: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_trips)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSavedLocations: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_saved_locations)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPayment: String? = MyApp.getInstance().resources.getString(R.string.lbl_payment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSettings: String? = MyApp.getInstance().resources.getString(R.string.lbl_settings)

)
