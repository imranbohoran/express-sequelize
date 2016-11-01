#!/usr/bin/env bash


export RAMPUP_USERS_FROM=1
export RAMPUP_USERS_TO=100
export RAMPUP_DURATION_IN_SECONDS=20
export CONSTANT_USERS_AFTER_RAMPUP=2
export CONSTANT_DURATION_AFTER_RAMPUP=120

mvn gatling:execute -Dgatling.simulationClass=com.bipmit.CreateUserSimulation
