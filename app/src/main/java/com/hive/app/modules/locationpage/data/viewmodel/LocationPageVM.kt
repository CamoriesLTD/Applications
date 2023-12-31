package com.hive.app.modules.locationpage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hive.app.modules.locationpage.`data`.model.LocationPageModel
import org.koin.core.KoinComponent

class LocationPageVM : ViewModel(), KoinComponent {
  val locationPageModel: MutableLiveData<LocationPageModel> = MutableLiveData(LocationPageModel())

  var navArguments: Bundle? = null
}
