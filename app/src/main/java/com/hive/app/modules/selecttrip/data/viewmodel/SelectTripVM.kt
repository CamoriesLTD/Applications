package com.hive.app.modules.selecttrip.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hive.app.modules.selecttrip.`data`.model.SelectTripModel
import org.koin.core.KoinComponent

class SelectTripVM : ViewModel(), KoinComponent {
  val selectTripModel: MutableLiveData<SelectTripModel> = MutableLiveData(SelectTripModel())

  var navArguments: Bundle? = null
}
