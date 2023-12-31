package com.hive.app.modules.paymentcardoptions.`data`.model

import com.hive.app.R
import com.hive.app.appcomponents.di.MyApp
import kotlin.String

data class PaymentCardOptionsModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPayments: String? = MyApp.getInstance().resources.getString(R.string.lbl_payments)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRemoveCard: String? = MyApp.getInstance().resources.getString(R.string.lbl_remove_card)
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
  var etGroupEightySevenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupSixtySixValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupSixtyFiveValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupSixtyFourValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupSixtyThreeValue: String? = null
)
