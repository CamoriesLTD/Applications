package com.hive.app.modules.triprating.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.hive.app.modules.triprating.`data`.model.TripRatingModel
import org.koin.core.KoinComponent

class TripRatingVM : ViewModel(), KoinComponent {
  val tripRatingModel: MutableLiveData<TripRatingModel> = MutableLiveData(TripRatingModel())

  var navArguments: Bundle? = null
}
