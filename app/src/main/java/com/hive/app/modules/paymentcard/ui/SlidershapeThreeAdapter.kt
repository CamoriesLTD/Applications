package com.hive.app.modules.paymentcard.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.hive.app.databinding.SlideritemPaymentCard1Binding
import com.hive.app.modules.paymentcard.`data`.model.ImageSliderSlidershapeThreeModel
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
    if (binding is SlideritemPaymentCard1Binding) {
      binding.imageSliderSlidershapeThreeModel = dataList[listPosition]
    }
  }

  override fun inflateView(
    viewType: Int,
    container: ViewGroup,
    listPosition: Int
  ): ViewBinding {
    val itemBinding =  SlideritemPaymentCard1Binding.inflate(
    LayoutInflater.from(container.context),
                    container,
                    false
    )
    return itemBinding
  }
}
