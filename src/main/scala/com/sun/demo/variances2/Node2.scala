package com.sun.demo.variances2

trait Node2[+T] {
  def prepend[S >: T](t: S): Node2[S]
}
