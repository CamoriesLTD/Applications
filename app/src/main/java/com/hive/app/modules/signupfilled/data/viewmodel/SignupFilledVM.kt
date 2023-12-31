package com.hive.app.modules.signupfilled.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.hive.app.modules.signupfilled.`data`.model.SignupFilledModel
import org.json.JSONObject
import org.koin.core.KoinComponent

class SignupFilledVM : ViewModel(), KoinComponent {
  val signupFilledModel: MutableLiveData<SignupFilledModel> = MutableLiveData(SignupFilledModel())


  var navArguments: Bundle? = null


  var facebookAuthResponse: JSONObject = JSONObject()


  lateinit var googleAuthResponse: GoogleSignInAccount
}
