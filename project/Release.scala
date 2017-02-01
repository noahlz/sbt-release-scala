import sbt._
import sbt.Keys._

// This build file constructed using guidance from the following blog post:
// http://blog.byjean.eu/2015/07/10/painless-release-with-sbt.html

import sbtrelease.ReleasePlugin.autoImport._

object Release {

  import ReleaseTransformations._

  lazy val settings = Seq(
    releaseProcess := Seq(
      // No Snapshot Dep check
      inquireVersions,
      // No Run Test
      setReleaseVersion,
      commitReleaseVersion,
      tagRelease,
      setNextVersion,
      commitNextVersion,
      pushChanges
    ),

    releaseTagComment := s"App v${(version in ThisBuild).value}",

    releaseCommitMessage := {
      val v = (version in ThisBuild).value
      if (v.endsWith("-SNAPSHOT")) {
        s"Post-release. Next version is $v"
      } else {
        s"App version $v"
      }
    }
  )

}
