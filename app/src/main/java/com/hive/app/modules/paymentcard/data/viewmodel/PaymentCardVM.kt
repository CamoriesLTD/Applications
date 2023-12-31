package com.hive.app.modules.paymentcard.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hive.app.modules.paymentcard.`data`.model.PaymentCardModel
import org.koin.core.KoinComponent

class PaymentCardVM : ViewModel(), KoinComponent {
  val paymentCardModel: MutableLiveData<PaymentCardModel> = MutableLiveData(PaymentCardModel())

  var navArguments: Bundle? = null
}
