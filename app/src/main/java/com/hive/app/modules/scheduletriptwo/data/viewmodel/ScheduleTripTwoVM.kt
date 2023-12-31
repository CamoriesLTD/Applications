package com.hive.app.modules.scheduletriptwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hive.app.modules.scheduletriptwo.`data`.model.ScheduleTripTwoModel
import org.koin.core.KoinComponent

class ScheduleTripTwoVM : ViewModel(), KoinComponent {
  val scheduleTripTwoModel: MutableLiveData<ScheduleTripTwoModel> =
      MutableLiveData(ScheduleTripTwoModel())

  var navArguments: Bundle? = null
}
