package org.github.noahlz.releaseplugintest

object HelloWorld {
  def main(args: Array[String]) {
    args match {
      case Array("say-hello")   => hello()
      case Array("say-goodbye") => goodbye()
      case Array("hangout")     => hangout()
      case _                    => hello()
    }
  }

  def hello() {
    println("Hello World!!!")
  }

  def goodbye() {
    println("Goodbye!!!")
  }

  def hangout() {
    println("...")
  }
}

