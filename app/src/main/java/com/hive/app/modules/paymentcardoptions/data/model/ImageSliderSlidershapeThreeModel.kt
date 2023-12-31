package com.hive.app.modules.paymentcardoptions.`data`.model

import com.hive.app.R
import com.hive.app.appcomponents.di.MyApp
import kotlin.String

data class ImageSliderSlidershapeThreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtExpDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_exp_date)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt0223: String? = MyApp.getInstance().resources.getString(R.string.lbl_02_23)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTanyaRobinson: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_tanya_robinson)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCardholder: String? = MyApp.getInstance().resources.getString(R.string.lbl_cardholder)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_1234_5678_912)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var imageShapeThree: String? = ""
  ,
  /**
   * TODO Replace with dynamic value
   */
  var imageShapeFour: String? = ""
  ,
  /**
   * TODO Replace with dynamic value
   */
  var imageRectangle: String? = ""

)
