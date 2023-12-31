package com.hive.app.modules.mytrips.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hive.app.modules.mytrips.`data`.model.MyTripsModel
import org.koin.core.KoinComponent

class MyTripsVM : ViewModel(), KoinComponent {
  val myTripsModel: MutableLiveData<MyTripsModel> = MutableLiveData(MyTripsModel())

  var navArguments: Bundle? = null
}
