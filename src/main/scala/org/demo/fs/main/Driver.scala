package org.demo.fs.main
import org.demo.fs.common.context
import org.demo.fs.common.Utils
import org.demo.fs.common.Constants

object Driver {
  def main(args: Array[String]): Unit = {
    val spark = context.getContext(Constants.PROFILE)
    //val df= spark.read.format("csv").load("file:///C:\\Users\\mahes\\OneDrive\\Desktop\\dummy.csv")
    //println(Utils.add(2,3))
    //df.show()

    val env = Constants.PROPS.getString("prof")
    println(Constants.PROPS.getConfig(env).getString("appName"))
    println(Constants.PROPS.getConfig(env).getString("appversion"))
   println(Constants.PROPS.getConfig(env).getConfig("application").getString("spark"))
  }
}
