package com.hive.app.modules.paymentcardoptions.ui

import android.net.Uri
import androidx.activity.viewModels
import com.hive.app.R
import com.hive.app.appcomponents.base.BaseActivity
import com.hive.app.databinding.ActivityPaymentCardOptionsBinding
import com.hive.app.modules.paymentcardoptions.`data`.model.ImageSliderSlidershapeThreeModel
import com.hive.app.modules.paymentcardoptions.`data`.viewmodel.PaymentCardOptionsVM
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class PaymentCardOptionsActivity :
    BaseActivity<ActivityPaymentCardOptionsBinding>(R.layout.activity_payment_card_options) {
  private val imageUri: Uri =
      Uri.parse("android.resource://com.hive.app/drawable/img_shape_white_a700_10x32")


  private val imageSliderSlidershapeThreeItems: ArrayList<ImageSliderSlidershapeThreeModel> =
      arrayListOf(ImageSliderSlidershapeThreeModel(imageShapeThree =
  imageUri.toString()),ImageSliderSlidershapeThreeModel(imageShapeThree =
  imageUri.toString()))


  private val viewModel: PaymentCardOptionsVM by viewModels<PaymentCardOptionsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val slidershapeThreeAdapter = SlidershapeThreeAdapter(imageSliderSlidershapeThreeItems,true)
    binding.imageSliderSlidershapeThree.adapter = slidershapeThreeAdapter
    binding.paymentCardOptionsVM = viewModel
  }

  override fun onPause(): Unit {
    binding.imageSliderSlidershapeThree.pauseAutoScroll()
    super.onPause()
  }

  override fun onResume(): Unit {
    super.onResume()
    binding.imageSliderSlidershapeThree.resumeAutoScroll()
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "PAYMENT_CARD_OPTIONS_ACTIVITY"

  }
}
