package com.hive.app.modules.savedlocationremove.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hive.app.modules.savedlocationremove.`data`.model.ListgroupfiftyoneRowModel
import com.hive.app.modules.savedlocationremove.`data`.model.SavedLocationRemoveModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SavedLocationRemoveVM : ViewModel(), KoinComponent {
  val savedLocationRemoveModel: MutableLiveData<SavedLocationRemoveModel> =
      MutableLiveData(SavedLocationRemoveModel())

  var navArguments: Bundle? = null

  val listgroupfiftyoneList: MutableLiveData<MutableList<ListgroupfiftyoneRowModel>> =
      MutableLiveData(mutableListOf())
}
