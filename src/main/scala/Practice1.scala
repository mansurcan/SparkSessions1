import org.apache.spark.sql.SparkSession

object Practice1 extends App{

  val spark = SparkSession.builder().master("local[*]").appName("ScalaPractise").getOrCreate()

  val df = spark.read.format("com.databricks.spark.csv").
    option("header", "true").option("mode", "DROPMALFORMED").
    load("C:\\Users\\mansu\\Downloads\\warehouse\\employees.csv")

  println(df.show(10))
  println(df.printSchema())

}
