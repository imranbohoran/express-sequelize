package com.bipmit

import io.gatling.core.Predef.{scenario => scn, _}
import io.gatling.http.Predef._

object CreateUser {
  val userNameFeeder = RandomUserFeeder()

  val scenario = scn("Create user")
    .feed(userNameFeeder)
    .exec(http("create user request")
      .post("http://localhost:3000/users/create")
      .formParam("username", "${user}")
      .check(status.is(200))
    )

}
