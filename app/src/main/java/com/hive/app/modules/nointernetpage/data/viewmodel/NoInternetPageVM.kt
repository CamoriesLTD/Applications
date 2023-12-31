package com.hive.app.modules.nointernetpage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hive.app.modules.nointernetpage.`data`.model.NoInternetPageModel
import org.koin.core.KoinComponent

class NoInternetPageVM : ViewModel(), KoinComponent {
  val noInternetPageModel: MutableLiveData<NoInternetPageModel> =
      MutableLiveData(NoInternetPageModel())

  var navArguments: Bundle? = null
}
