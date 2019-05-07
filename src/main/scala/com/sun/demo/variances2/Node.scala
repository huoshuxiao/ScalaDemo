package com.sun.demo.variances2

trait Node[+T] {
  def prepend[T](t: T): Node[T]
}
