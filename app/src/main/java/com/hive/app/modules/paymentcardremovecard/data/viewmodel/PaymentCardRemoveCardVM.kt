package com.hive.app.modules.paymentcardremovecard.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hive.app.modules.paymentcardremovecard.`data`.model.PaymentCardRemoveCardModel
import org.koin.core.KoinComponent

class PaymentCardRemoveCardVM : ViewModel(), KoinComponent {
  val paymentCardRemoveCardModel: MutableLiveData<PaymentCardRemoveCardModel> =
      MutableLiveData(PaymentCardRemoveCardModel())

  var navArguments: Bundle? = null
}
