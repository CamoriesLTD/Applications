package com.hive.app.modules.paymentcard.ui

import android.net.Uri
import androidx.activity.viewModels
import com.hive.app.R
import com.hive.app.appcomponents.base.BaseActivity
import com.hive.app.databinding.ActivityPaymentCardBinding
import com.hive.app.modules.paymentcard.`data`.model.ImageSliderSlidershapeThreeModel
import com.hive.app.modules.paymentcard.`data`.viewmodel.PaymentCardVM
import kotlin.String
import kotlin.Unit
import kotlin.collections.ArrayList

class PaymentCardActivity : BaseActivity<ActivityPaymentCardBinding>(R.layout.activity_payment_card)
    {
  private val imageUri: Uri =
      Uri.parse("android.resource://com.hive.app/drawable/img_shape_white_a700_10x32")


  private val imageSliderSlidershapeThreeItems: ArrayList<ImageSliderSlidershapeThreeModel> =
      arrayListOf(ImageSliderSlidershapeThreeModel(imageShapeThree =
  imageUri.toString()),ImageSliderSlidershapeThreeModel(imageShapeThree =
  imageUri.toString()))


  private val viewModel: PaymentCardVM by viewModels<PaymentCardVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val slidershapeThreeAdapter = SlidershapeThreeAdapter(imageSliderSlidershapeThreeItems,true)
    binding.imageSliderSlidershapeThree.adapter = slidershapeThreeAdapter
    binding.imageSliderSlidershapeThree.onIndicatorProgress = { selectingPosition, progress ->
      binding.indicatorDots.onPageScrolled(selectingPosition, progress)
    }
    binding.indicatorDots.updateIndicatorCounts(binding.imageSliderSlidershapeThree.indicatorCount)
    binding.paymentCardVM = viewModel
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
    const val TAG: String = "PAYMENT_CARD_ACTIVITY"

  }
}
