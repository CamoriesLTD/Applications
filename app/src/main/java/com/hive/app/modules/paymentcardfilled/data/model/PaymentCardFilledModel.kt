package com.hive.app.modules.paymentcardfilled.`data`.model

import com.hive.app.R
import com.hive.app.appcomponents.di.MyApp
import kotlin.String

data class PaymentCardFilledModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPayments: String? = MyApp.getInstance().resources.getString(R.string.lbl_payments)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCardholderName: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_cardholder_name)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCardNumber: String? = MyApp.getInstance().resources.getString(R.string.lbl_card_number)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCvvcvc: String? = MyApp.getInstance().resources.getString(R.string.lbl_cvv_cvc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtExpDateTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_exp_date)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupSeventySevenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupSeventySixValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupSeventyFiveValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupSeventyFourValue: String? = null
)
