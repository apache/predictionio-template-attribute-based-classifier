package org.template.classification

import org.apache.predictionio.controller.EngineFactory
import org.apache.predictionio.controller.Engine

class Query(
  val attr0 : Double,
  val attr1 : Double,
  val attr2 : Double
) extends Serializable

class PredictedResult(
  val label: Double
) extends Serializable

class ActualResult(
  val label: Double
) extends Serializable

object ClassificationEngine extends EngineFactory {
  def apply() = {
    new Engine(
      classOf[DataSource],
      classOf[Preparator],
      Map("naive" -> classOf[NaiveBayesAlgorithm]),
      classOf[Serving])
  }
}
