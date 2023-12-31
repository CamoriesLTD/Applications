package com.hive.app.modules.editprofile.`data`.model

import com.hive.app.R
import com.hive.app.appcomponents.di.MyApp
import kotlin.String

data class EditProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEditProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_edit_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEdityourpictu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_edit_your_pictu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUserName: String? = MyApp.getInstance().resources.getString(R.string.lbl_user_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmailOne: String? = MyApp.getInstance().resources.getString(R.string.msg_zayadnh13_gmail)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVerified: String? = MyApp.getInstance().resources.getString(R.string.lbl_verified)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMobileNumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_mobile_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt96279068848: String? = MyApp.getInstance().resources.getString(R.string.msg_962_7_9068_848)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVerifiedOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_verified)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupThirtyNineValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupThirtySixValue: String? = null
)
