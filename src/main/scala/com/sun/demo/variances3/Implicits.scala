package com.sun.demo.variances3

/**
  * 隐式
  * 可用于类/方法/参数
  */
object Implicits {

  // 只能在内部定义，只能有一个非隐式参数
  implicit class RichInt(x: Int) {
    // 方法名必须唯一
    def addOne(y: Int): Int = x + y
  }

  // 隐式方法(不可以写死返回值) 自动调用
  implicit def string2Int(x: String) = {
    x.toInt
  }

  // 隐式参数
  implicit val x = 100
  def add(implicit x: Int): Int = {
    13 + x
  }

  def sum(x: Int): Int = {
    add(x)
  }

  implicit def intMonoid: AbstractMonoid[Int] = new AbstractMonoid[Int] {
    override def add(x: Int, y: Int): Int = x + y

    override def unit: Int = 0
  }

  def sum[T](xs: List[T])(implicit m: AbstractMonoid[T]): T = {
    if (xs.isEmpty)
      m.unit
    else
      m.add(xs.head, sum(xs.tail))
  }


  def main(args: Array[String]): Unit = {
//    val implicits = new Implicits()
//    println(sum(List(1,2,3)))

    // 自动调用隐式方法string2Int
    println(sum("13"))

    // 隐式参数
    println(add)

    // 隐式类
    println(2.addOne(3))
  }
}
