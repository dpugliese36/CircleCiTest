package com.angryoak

import org.scalatest.{FreeSpec, Matchers}

/**
  * Created by dpugliese on 4/24/18.
  */
class CircleCiTestSpec extends FreeSpec with Matchers {

  "CircleCiTest" - {
    "should have a good message" in {
      CircleCiTest.message should be ("Hello")
    }
  }
}
