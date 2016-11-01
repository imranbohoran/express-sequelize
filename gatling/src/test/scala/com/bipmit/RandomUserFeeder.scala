package com.bipmit

import io.gatling.core.feeder.Feeder

import scala.util.Random

object RandomUserFeeder {
  val random = new Random()

  def apply():  Feeder[String] = {
    Iterator.continually(Map(
      ("user", "u-"+ Random.nextInt() + "-generated")
    ))
  }
}
