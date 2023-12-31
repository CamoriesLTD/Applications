package com.hive.app.modules.meetdriver.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hive.app.modules.meetdriver.`data`.model.MeetDriverModel
import org.koin.core.KoinComponent

class MeetDriverVM : ViewModel(), KoinComponent {
  val meetDriverModel: MutableLiveData<MeetDriverModel> = MutableLiveData(MeetDriverModel())

  var navArguments: Bundle? = null
}
