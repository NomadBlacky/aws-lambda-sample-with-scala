package org.nomadblacky.aws.lambda.samples

import com.amazonaws.services.lambda.runtime.Context

import scala.beans.BeanProperty
import scala.io.Source

/**
 * Created by blacky on 17/05/28.
 */
class AwsLambdaSample {
  def hello(request: Request, context: Context): Responce = {
    Responce(Source.fromURL(request.url).mkString)
  }
}

case class Request(@BeanProperty var url: String) {
  def this() = this(url = "")
}

case class Responce(@BeanProperty var body: String) {
  def this() = this(body = "")
}