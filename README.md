# Classification Engine Template

## Documentation

Please refer to http://docs.prediction.io/templates/classification/quickstart/

## Versions

### v0.3.1

- Change query format from
    `{ features: [2, 0, 0] }`
  to
    `{ "attr0":2, "attr1":0, "attr2":0 }`

  Query class, DataSource readEval(), and algorithm's predict() is updated accordingly.

### v0.3.0

- update for PredictionIO 0.9.2, including:

  - use new PEventStore API
  - use appName in DataSource parameter

### v0.2.0

- update build.sbt and template.json for PredictionIO 0.9.2

### v0.1.4

- Update Evaluation for PredictionIO 0.9.1

NOTE: Require PredictionIO >= 0.9.1

### v0.1.3

- Add missing sample data set (data/data.txt)

### v0.1.2

- update for PredictionIO 0.9.0
- add sample evaluation

### v0.1.1

- Persist RDD to memory (.cache()) in DataSource for better performance

### v0.1.0

- initial version
