package com.hive.app.modules.homepageloading.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hive.app.modules.homepageloading.`data`.model.HomePageLoadingModel
import org.koin.core.KoinComponent

class HomePageLoadingVM : ViewModel(), KoinComponent {
  val homePageLoadingModel: MutableLiveData<HomePageLoadingModel> =
      MutableLiveData(HomePageLoadingModel())

  var navArguments: Bundle? = null
}
