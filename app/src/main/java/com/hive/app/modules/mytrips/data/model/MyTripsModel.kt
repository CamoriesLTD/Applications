package com.hive.app.modules.mytrips.`data`.model

import com.hive.app.R
import com.hive.app.appcomponents.di.MyApp
import kotlin.String

data class MyTripsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMyTrips: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_rents)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOct092020: String? = MyApp.getInstance().resources.getString(R.string.lbl_oct_09_2020)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUsdCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_6_40_usd)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFordFusion: String? = MyApp.getInstance().resources.getString(R.string.lbl_ford_fusion)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOct072020: String? = MyApp.getInstance().resources.getString(R.string.lbl_oct_07_2020)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUsdCounterOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_7_80_usd)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKIAOptima: String? = MyApp.getInstance().resources.getString(R.string.lbl_kia_optima)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOct062020: String? = MyApp.getInstance().resources.getString(R.string.lbl_oct_06_2020)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUsdCounterTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_50_usd)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFordFusionOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_ford_fusion)

)
