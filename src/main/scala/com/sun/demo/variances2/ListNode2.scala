package com.sun.demo.variances2

case class ListNode2[+T](h: T, t: Node2[T]) extends Node2[T] {

  override def prepend[S >: T](t: S): ListNode2[S] = {
    ListNode2(t, this)
  }

  def head: T = h

  def tail: Node2[T] = t
}
