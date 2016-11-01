package com.bipmit

import io.gatling.core.Predef._

import scala.concurrent.duration._

class CreateUserSimulation extends Simulation {
  val rampupUsersFrom = sys.env.getOrElse("RAMPUP_USERS_FROM", "1").toDouble
  val rampupUsersTo = sys.env.getOrElse("RAMPUP_USERS_TO", "10").toDouble
  val rampupDuration = sys.env.getOrElse("RAMPUP_DURATION_IN_SECONDS", "60").toInt.seconds

  val constantUsers = sys.env.getOrElse("CONSTANT_USERS_AFTER_RAMPUP", "5").toDouble
  val constantDuration = sys.env.getOrElse("CONSTANT_DURATION_AFTER_RAMPUP", "120").toInt.seconds

  setUp(
//      CreateUser.scenario.inject(
//        rampUsersPerSec(rampupUsersFrom) to rampupUsersTo during rampupDuration,
//        constantUsersPerSec(constantUsers) during constantDuration)
    CreateUser.scenario.inject(atOnceUsers(1))
  )
}
