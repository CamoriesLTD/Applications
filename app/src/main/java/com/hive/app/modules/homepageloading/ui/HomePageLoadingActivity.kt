package com.hive.app.modules.homepageloading.ui

import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.hive.app.R
import com.hive.app.appcomponents.base.BaseActivity
import com.hive.app.databinding.ActivityHomePageLoadingBinding
import com.hive.app.modules.homepageloading.`data`.viewmodel.HomePageLoadingVM
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class HomePageLoadingActivity :
    BaseActivity<ActivityHomePageLoadingBinding>(R.layout.activity_home_page_loading) {
  private val viewModel: HomePageLoadingVM by viewModels<HomePageLoadingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homePageLoadingVM = viewModel
    setUpSearchViewSearchFieldListener()
  }

  override fun setUpClicks(): Unit {
  }

  private fun setUpSearchViewSearchFieldListener(): Unit {
    binding.searchViewSearchField.setOnQueryTextListener(object :
    SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "HOME_PAGE_LOADING_ACTIVITY"

    }
  }
