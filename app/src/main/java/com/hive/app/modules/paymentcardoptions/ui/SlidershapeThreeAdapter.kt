package com.hive.app.modules.paymentcardoptions.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.hive.app.databinding.SlideritemPaymentCardOptions1Binding
import com.hive.app.modules.paymentcardoptions.`data`.model.ImageSliderSlidershapeThreeModel
import java.util.ArrayList
import kotlin.Boolean
import kotlin.Int

class SlidershapeThreeAdapter(
  val dataList: ArrayList<ImageSliderSlidershapeThreeModel>,
  val mIsInfinite: Boolean
) : LoopingPagerAdapter<ImageSliderSlidershapeThreeModel>(dataList, mIsInfinite) {
  override fun bindView(
    binding: ViewBinding,
    listPosition: Int,
    viewType: Int
  ) {
    if (binding is SlideritemPaymentCardOptions1Binding) {
      binding.imageSliderSlidershapeThreeModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemPaymentCardOptions1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
