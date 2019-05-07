package com.sun.demo

import com.sun.demo.classes.SHello

import scala.util.Random
import scala.util.matching.Regex

/*
 * object是单类对象
 */
object Main {

  // val == final
  // var

  def main(args: Array[String]): Unit = {

    println(testPatternMatching(Random.nextInt(10)))

    callSHello()

    testPattern()
  }

  def testPattern(): Unit = {
    // 调用.r 将字符串转换为正则表达式
    val numPattern: Regex = "[0-9]".r
    // 取得第一个数字
    numPattern.findFirstIn("a2s1").foreach(u=>println(u))

    // 包含数字时打印ok，反之打印none
    val opt = numPattern.findFirstMatchIn("abc0")
    opt match {
      case Some(_) => println("number is ok")
      case None => println("none")
    }

  }

  def callSHello(): Unit = {
    val sHello = new SHello()
    val arrays = Array[String]("a","b","c")
    sHello.main(arrays)
  }

// scala object can't call java class
//  def callJHello(): Unit = {
//    val sHello = new JHello()
//    val arrays = new Array[String](3)
//
//    sHello.main(arrays)
//  }


  def testPatternMatching(x: Int): String = {

//    val x: Int = (Math.random()*10).intValue()
    var y: String = ""
    x match {
      case 0 => y = "zero"
      case 3 => y = "three"
      case _ => y = "any"
    }
//    println(x,y)
    y
  }



}
