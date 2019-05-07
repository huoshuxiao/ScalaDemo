package com.sun.demo.variances2

class Nil[+T] extends Node[T] {

  override def prepend[T](t: T): Node[T] = {
//    ListNode(t, this)
    null
  }
}
