import sbt.Keys._
import sbt._

object App extends Build {

  lazy val appVersion = SettingKey[String]("version", "current version of the project")

  lazy val dependencies = Seq(
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "2.1.7" % "test"
    )
  )

  lazy val root = Project(
    id = "app",
    base = file("."),
    settings = Defaults.coreDefaultSettings ++
      Seq(
        name := "App",
        organization := "org.github.noahlz",
        version <<= App.appVersion,
        scalaVersion := "2.10.4",
        javacOptions ++= Seq("-source", "1.7", "-target", "1.7"),
        compile <<= (compile in Compile) dependsOn (compile in Test),
        publishTo := Some("temp" at "file:///tmp/repository") // Required by release plugin. Replace with your actual repo..
      ) ++
      dependencies ++
      Release.settings
  )

}
