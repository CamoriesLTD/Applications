package com.hive.app.modules.scheduletripone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hive.app.modules.scheduletripone.`data`.model.ScheduleTripOneModel
import org.koin.core.KoinComponent

class ScheduleTripOneVM : ViewModel(), KoinComponent {
  val scheduleTripOneModel: MutableLiveData<ScheduleTripOneModel> =
      MutableLiveData(ScheduleTripOneModel())

  var navArguments: Bundle? = null
}
