package sparkdemo.datagenerator

import java.io.FileWriter
import java.io.File
import scala.util.Random

object PriceGenerator{
  def main(args:Array[String]){
    val writer = new FileWriter(new File("F:\\pricetest.txt"),false)
    val rand=new Random()
    for(i <- 1 to 100000){
      writer.write(i+" "+(Random.nextInt(100).toDouble +Random.nextDouble()))
      writer.write(System.getProperty("line.separator"))
    }
    writer.flush()
    writer.close()
  }
}