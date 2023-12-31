package com.hive.app.modules.paymentcardoptions.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hive.app.modules.paymentcardoptions.`data`.model.PaymentCardOptionsModel
import org.koin.core.KoinComponent

class PaymentCardOptionsVM : ViewModel(), KoinComponent {
  val paymentCardOptionsModel: MutableLiveData<PaymentCardOptionsModel> =
      MutableLiveData(PaymentCardOptionsModel())

  var navArguments: Bundle? = null
}
