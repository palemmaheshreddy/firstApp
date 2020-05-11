package org.demo.fs.common

import com.typesafe.config.{Config,ConfigFactory}

object Constants {
  val PROFILE="dev"
  val path= "file:///C:\\Users\\mahes\\OneDrive\\Desktop\\application.properties"
  val PROPS:Config =ConfigFactory.load()
}
