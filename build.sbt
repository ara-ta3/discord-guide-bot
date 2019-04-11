val commonSettings = Seq(
    version := "0.1-SNAPSHOT",
    scalaVersion := "2.12.8",
    conflictManager := ConflictManager.strict,
    scalacOptions ++= Seq(

    ),
)

lazy val root = (project in file("."))
  .settings(commonSettings)
  .settings(
      name := "discord build",
      libraryDependencies ++= Seq(
          "com.discord4j" % "discord4j-core" % "3.0.2",
          "com.discord4j" % "discord4j-common" % "3.0.2",
          "com.typesafe" % "config" % "1.3.3"
      )
  )
