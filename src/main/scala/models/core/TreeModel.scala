package models.core

import org.apache.spark.mllib.regression.LabeledPoint
import org.apache.spark.mllib.tree.model.RandomForestModel
import org.apache.spark.rdd.RDD

/**
  * Created by WeiChen on 2016/5/26.
  */
abstract class TreeModel extends Serializable{
  def train

  def accurate

  def hyperParameterTuning
}
