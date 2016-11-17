name := """poi-scala"""

version := "0.16-SNAPSHOT"

scalaVersion := "2.11.8"

val scalazVersion = "7.2.1"
val poiVersion = "3.15"
val specsVersion = "3.7.2"

lazy val poi = Project(
  id = "poi",
  base = file(".")
).settings(
  organization := "info.folone",

  scalacOptions := Seq(
    "-encoding", "UTF-8",
    "-deprecation",
    "-unchecked",
    "-explaintypes"
  ),

  parallelExecution in Compile := true,

  libraryDependencies ++= Seq(
    "org.apache.poi" % "poi" % poiVersion,
    "org.apache.poi" % "poi-ooxml" % poiVersion,
    "org.scalaz" %% "scalaz-core" % scalazVersion,
    "org.scalaz" %% "scalaz-effect" % scalazVersion,
    "org.specs2" %% "specs2-core" % specsVersion % "test",
    "org.specs2" %% "specs2-scalacheck" % specsVersion % "test",
    "org.scalacheck" %% "scalacheck" % "1.13.0" % "test",
    "org.scalaz" %% "scalaz-scalacheck-binding" % scalazVersion % "test"
  )
)
