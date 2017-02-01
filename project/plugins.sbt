resolvers ++= Seq(
  Classpaths.sbtPluginReleases
)

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.1.9"

addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.4")
