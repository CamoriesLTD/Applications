package com.hive.app.firestore.models

import com.google.firebase.firestore.PropertyName
import kotlin.String
import kotlin.jvm.JvmField

public class cars {
  @JvmField
  @PropertyName("cName")
  public var cName: String? = null

  @JvmField
  @PropertyName("cModel")
  public var cModel: String? = null

  @JvmField
  @PropertyName("cType")
  public var cType: String? = null
}
