package com.sun.demo

import com.sun.demo.parameters.Params

object ParamsMain {

  def main(args: Array[String]): Unit = {
    var i = 3
    val param = new Params()

//    param.loop(i > 0, i)
//    param.loop2(i > 0)(i)
    param.loop3(i*i)

    param.loop(i > 0) {
      println(i)
      i -= 1
    }

  }
}
