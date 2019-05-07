package com.sun.demo.variances2

class ListNode[T](t: T, n: Node[T]) extends Node[T] {

  override def prepend[T](t: T): Node[T] = {
//    new ListNode[T](t, this)
    null
  }

  def head: T = t

  def tail: Node[T] = n
}
