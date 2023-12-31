package com.hive.app.modules.searchpage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hive.app.modules.searchpage.`data`.model.ListgroupeightRowModel
import com.hive.app.modules.searchpage.`data`.model.ListgroupfiveRowModel
import com.hive.app.modules.searchpage.`data`.model.SearchPageModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SearchPageVM : ViewModel(), KoinComponent {
  val searchPageModel: MutableLiveData<SearchPageModel> = MutableLiveData(SearchPageModel())

  var navArguments: Bundle? = null

  val listgroupeightList: MutableLiveData<MutableList<ListgroupeightRowModel>> =
      MutableLiveData(mutableListOf())

  val listgroupfiveList: MutableLiveData<MutableList<ListgroupfiveRowModel>> =
      MutableLiveData(mutableListOf())
}
