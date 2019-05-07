package com.sun.demo.variances2

class Nil2[+T] extends Node2[T] {

  override def prepend[S >: T](t: S): ListNode2[S] = {
    new ListNode2(t, this)
  }
}
