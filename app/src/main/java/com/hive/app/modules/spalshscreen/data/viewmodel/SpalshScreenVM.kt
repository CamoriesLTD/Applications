package com.hive.app.modules.spalshscreen.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hive.app.modules.spalshscreen.`data`.model.SpalshScreenModel
import org.koin.core.KoinComponent

class SpalshScreenVM : ViewModel(), KoinComponent {
  val spalshScreenModel: MutableLiveData<SpalshScreenModel> = MutableLiveData(SpalshScreenModel())

  var navArguments: Bundle? = null
}
