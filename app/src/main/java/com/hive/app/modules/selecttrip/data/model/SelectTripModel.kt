package com.hive.app.modules.selecttrip.`data`.model

import com.hive.app.R
import com.hive.app.appcomponents.di.MyApp
import kotlin.String

data class SelectTripModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNearsetdriver: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_nearset_driver)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAllenGilbert: String? = MyApp.getInstance().resources.getString(R.string.lbl_allen_gilbert)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRating: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_8)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFordFusion202: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ford_fusion_202)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPaymentmethod: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_payment_method)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCash: String? = MyApp.getInstance().resources.getString(R.string.lbl_cash)

)
