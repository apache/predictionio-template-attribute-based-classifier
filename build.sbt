import AssemblyKeys._

assemblySettings

name := "template-scala-parallel-classification"

organization := "io.prediction"

libraryDependencies ++= Seq(
  "io.prediction"    %% "core"          % pioVersion.value % "provided",
  "org.apache.spark" %% "spark-core"    % "1.3.1" % "provided",
  "org.apache.spark" %% "spark-mllib"   % "1.3.1" % "provided")
