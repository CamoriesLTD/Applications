package com.hive.app.modules.paymentcardfilled.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.hive.app.databinding.SlideritemPaymentCardFilled1Binding
import com.hive.app.modules.paymentcardfilled.`data`.model.ImageSliderSlidershapeThreeModel
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
    if (binding is SlideritemPaymentCardFilled1Binding) {
      binding.imageSliderSlidershapeThreeModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemPaymentCardFilled1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
