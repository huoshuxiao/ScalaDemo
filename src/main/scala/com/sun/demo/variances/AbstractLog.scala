package com.sun.demo.variances

// 协变 父类型
// 向下变换
abstract class AbstractLog[+T]/*(t: T)*/ {

  // 方法接收类型参数（>:用于协变 U是T的父类型.0）1
  def log[U >: T](u: U): Unit

//  // 返回结果为类型参数
//  def get(): T = {
//    new T
//  }
}
