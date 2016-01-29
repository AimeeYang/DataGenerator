package sparkdemo.datagenerator
/**
  * Created by ayang on 2016/1/29.
  * refer: https://www.ibm.com/developerworks/cn/opensource/os-cn-spark-practice1/
  */
import java.io.FileWriter
import java.io.File
import scala.util.Random

object PriceGenerator{
  def main(args:Array[String]){
    val writer = new FileWriter(new File("F:\\pricetest.txt"),false)
    val rand=new Random()
    for(i <- 1 to 100000){
      writer.write(i+" "+Random.nextInt(100))
      writer.write(System.getProperty("line.separator"))
    }
    writer.flush()
    writer.close()
  }
}