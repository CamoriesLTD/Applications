package com.hive.app.modules.savedlocation.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hive.app.modules.savedlocation.`data`.model.SavedLocationModel
import com.hive.app.modules.savedlocation.`data`.model.SavedLocationRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SavedLocationVM : ViewModel(), KoinComponent {
  val savedLocationModel: MutableLiveData<SavedLocationModel> =
      MutableLiveData(SavedLocationModel())

  var navArguments: Bundle? = null

  val savedLocationList: MutableLiveData<MutableList<SavedLocationRowModel>> =
      MutableLiveData(mutableListOf())
}
