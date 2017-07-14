package org.example.classification

import org.apache.predictionio.controller.EngineFactory
import org.apache.predictionio.controller.Engine

case class Query(
  attr0 : Double,
  attr1 : Double,
  attr2 : Double
)

case class PredictedResult(
  label: Double
)

case class ActualResult(
  label: Double
)

object ClassificationEngine extends EngineFactory {
  def apply() = {
    new Engine(
      classOf[DataSource],
      classOf[Preparator],
      Map("naive" -> classOf[NaiveBayesAlgorithm]),
      classOf[Serving])
  }
}
