package com.sun.demo.variances

// 逆变 子类型
// 向下变换
abstract class AbstractPrinter[-T]/*(t: T)*/ {

  def print(t: T): Unit

//  // 方法接收类型参数（<:用于逆变 U是T的子类型）
//  def get[U <: T](): U = {
//    new U
//  }
}
