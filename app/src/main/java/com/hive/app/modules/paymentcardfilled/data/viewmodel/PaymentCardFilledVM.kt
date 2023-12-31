package com.hive.app.modules.paymentcardfilled.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hive.app.modules.paymentcardfilled.`data`.model.PaymentCardFilledModel
import org.koin.core.KoinComponent

class PaymentCardFilledVM : ViewModel(), KoinComponent {
  val paymentCardFilledModel: MutableLiveData<PaymentCardFilledModel> =
      MutableLiveData(PaymentCardFilledModel())

  var navArguments: Bundle? = null
}
