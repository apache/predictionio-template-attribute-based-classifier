package org.template.classification

import org.apache.predictionio.controller.OptionAverageMetric
import org.apache.predictionio.controller.EmptyEvaluationInfo
import org.apache.predictionio.controller.Evaluation

case class Precision(label: Double)
  extends OptionAverageMetric[EmptyEvaluationInfo, Query, PredictedResult, ActualResult] {
  override def header: String = s"Precision(label = $label)"

  def calculate(query: Query, predicted: PredictedResult, actual: ActualResult)
  : Option[Double] = {
    if (predicted.label == label) {
      if (predicted.label == actual.label) {
        Some(1.0)  // True positive
      } else {
        Some(0.0)  // False positive
      }
    } else {
      None  // Unrelated case for calculating precision
    }
  }
}

object PrecisionEvaluation extends Evaluation {
  engineMetric = (ClassificationEngine(), new Precision(label = 1.0))
}
