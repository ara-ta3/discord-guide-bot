val commonSettings = Seq(
    version := "0.1-SNAPSHOT",
    scalaVersion := "2.12.8",
    conflictManager := ConflictManager.strict,
    scalacOptions ++= Seq(
        "-deprecation",
        "-feature",
        "-unchecked",
        "-language:implicitConversions",
        "-Xlint",
        "-Xfatal-warnings",
        "-Ywarn-numeric-widen",
        "-Ywarn-unused",
        "-Ywarn-unused-import",
        "-Ywarn-value-discard",
    ),
)

lazy val root = (project in file("."))
  .settings(commonSettings)
  .settings(
      name := "discord build",
      libraryDependencies ++= Seq(
          "com.discord4j" % "Discord4J" % "2.10.1"
      )
  )