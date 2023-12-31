package com.hive.app.modules.loginfilled.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.hive.app.modules.loginfilled.`data`.model.LoginFilledModel
import org.json.JSONObject
import org.koin.core.KoinComponent

class LoginFilledVM : ViewModel(), KoinComponent {
  val loginFilledModel: MutableLiveData<LoginFilledModel> = MutableLiveData(LoginFilledModel())


  var navArguments: Bundle? = null


  var facebookAuthResponse: JSONObject = JSONObject()


  lateinit var googleAuthResponse: GoogleSignInAccount
}
