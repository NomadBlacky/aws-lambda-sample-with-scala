package org.nomadblacky.aws.lambda.samples

import com.amazonaws.services.lambda.runtime.Context
import scala.collection.JavaConverters._

/**
  * Created by blacky on 17/05/28.
  */
class AwsLambdaSample {
  def hello(value: Int, context: Context): java.util.List[String] = {
    List("a", "b", "c").asJava
  }
}
