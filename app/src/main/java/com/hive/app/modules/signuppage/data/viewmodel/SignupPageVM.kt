package com.hive.app.modules.signuppage.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.hive.app.modules.signuppage.`data`.model.SignupPageModel
import org.json.JSONObject
import org.koin.core.KoinComponent

class SignupPageVM : ViewModel(), KoinComponent {
  val signupPageModel: MutableLiveData<SignupPageModel> = MutableLiveData(SignupPageModel())


  var navArguments: Bundle? = null


  var facebookAuthResponse: JSONObject = JSONObject()


  lateinit var googleAuthResponse: GoogleSignInAccount
}
