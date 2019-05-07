package com.sun.demo.parameters

class Params {

  /**
    *
    * @param condition
    * @param body 代码逻辑体
    */
  def loop(condition: => Boolean)(body: => Unit): Unit = {
    if (condition) {
      body
      loop(condition)(body)
    }
  }

  def loop(condition: Boolean, i: Int): Unit = {
    if (condition) {
      println(s"i: $i")
      if (i - 1 > 0) {
        loop(true, i - 1)
      }

    }
  }

  // 柯里化函数
  def loop2(condition: Boolean)(i: Int): Int = {
    loop(condition,i)
    i
  }

  def loop3(j: Int) = loop2(true)(j)
}

