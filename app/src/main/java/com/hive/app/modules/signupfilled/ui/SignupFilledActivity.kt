package com.hive.app.modules.signupfilled.ui

import android.content.Intent
import androidx.activity.viewModels
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.hive.app.R
import com.hive.app.appcomponents.base.BaseActivity
import com.hive.app.appcomponents.facebookauth.FacebookHelper
import com.hive.app.appcomponents.googleauth.GoogleHelper
import com.hive.app.databinding.ActivitySignupFilledBinding
import com.hive.app.modules.signupfilled.`data`.viewmodel.SignupFilledVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SignupFilledActivity :
    BaseActivity<ActivitySignupFilledBinding>(R.layout.activity_signup_filled) {
  private val viewModel: SignupFilledVM by viewModels<SignupFilledVM>()

  private var callbackManager: CallbackManager = CallbackManager.Factory.create()

  private val facebookLogin: FacebookHelper = FacebookHelper()

  private lateinit var googleLogin: GoogleHelper

  override fun onActivityResult(
    requestCode: Int,
    resultCode: Int,
    `data`: Intent?
  ) {
    callbackManager.onActivityResult(requestCode, resultCode, data)
    super.onActivityResult(requestCode,resultCode,data)
  }

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signupFilledVM = viewModel
    googleLogin = GoogleHelper(this,
    { accountInfo ->
      },{ error -> 

      })
    }

    override fun setUpClicks(): Unit {
      binding.linearFacebook.setOnClickListener {
        LoginManager.getInstance().logInWithReadPermissions(this, listOf("public_profile"))
        facebookLogin.login(callbackManager,object : FacebookCallback<LoginResult> {
          override fun onSuccess(result: LoginResult?) {
          }
          override fun onError(error: FacebookException?) {
          }
          override fun onCancel() {
          }
          })
        }
        binding.linearGoogle.setOnClickListener {
          googleLogin.login()
        }
      }

      companion object {
        const val TAG: String = "SIGNUP_FILLED_ACTIVITY"

      }
    }
