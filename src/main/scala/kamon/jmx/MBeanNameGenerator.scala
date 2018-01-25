package kamon.jmx

import kamon.metric.{ Entity, MetricKey }

trait MBeanNameGenerator {
  def generateName(entity: Entity, metricKey: MetricKey): String
}

class SimpleMBeanNameGenerator extends MBeanNameGenerator {
  override def generateName(entity: Entity, metricKey: MetricKey) = {
    entity.name + "." + metricKey.name
  }
}