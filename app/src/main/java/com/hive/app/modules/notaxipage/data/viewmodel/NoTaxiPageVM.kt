package com.hive.app.modules.notaxipage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hive.app.modules.notaxipage.`data`.model.NoTaxiPageModel
import org.koin.core.KoinComponent

class NoTaxiPageVM : ViewModel(), KoinComponent {
  val noTaxiPageModel: MutableLiveData<NoTaxiPageModel> = MutableLiveData(NoTaxiPageModel())

  var navArguments: Bundle? = null
}
