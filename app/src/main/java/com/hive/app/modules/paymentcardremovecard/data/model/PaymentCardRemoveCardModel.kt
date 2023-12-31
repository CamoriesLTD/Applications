package com.hive.app.modules.paymentcardremovecard.`data`.model

import com.hive.app.R
import com.hive.app.appcomponents.di.MyApp
import kotlin.String

data class PaymentCardRemoveCardModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_are_you_sure_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCancel: String? = MyApp.getInstance().resources.getString(R.string.lbl_cancel)

)
