package org.demo.fs.common
import org.apache.spark._
import org.apache.spark.sql.{SQLContext, SparkSession}

object context {
  def getSession(profile: String): SparkSession = {
    val conf: SparkConf = new SparkConf().set("spark.sql.orc.enabled", "true")
    val sparkSession = SparkSession.builder().appName("My First App").config(conf).config("spark.master", "local").enableHiveSupport().getOrCreate()
    sparkSession
  }

  def getContext(profile:String):SQLContext={

    getSession(profile).sqlContext
  }
}
