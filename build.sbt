name := "template-scala-parallel-classification"

organization := "org.apache.predictionio"

libraryDependencies ++= Seq(
  "org.apache.predictionio" %% "apache-predictionio-core" % "0.11.0-incubating" % "provided",
  "org.apache.spark"        %% "spark-core"               % "1.3.1" % "provided",
  "org.apache.spark"        %% "spark-mllib"              % "1.3.1" % "provided")
