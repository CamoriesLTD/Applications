package com.hive.app.modules.paymentcardremovecard.ui

import android.content.Context
import androidx.fragment.app.viewModels
import com.hive.app.R
import com.hive.app.appcomponents.base.BaseDialogFragment
import com.hive.app.databinding.DialogPaymentCardRemoveCardBinding
import com.hive.app.modules.paymentcardremovecard.`data`.viewmodel.PaymentCardRemoveCardVM
import kotlin.String
import kotlin.Unit

class PaymentCardRemoveCardDialog :
    BaseDialogFragment<DialogPaymentCardRemoveCardBinding>(R.layout.dialog_payment_card_remove_card)
    {
  private val viewModel: PaymentCardRemoveCardVM by viewModels<PaymentCardRemoveCardVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.paymentCardRemoveCardVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "PAYMENT_CARD_REMOVE_CARD_DIALOG"

  }
}
