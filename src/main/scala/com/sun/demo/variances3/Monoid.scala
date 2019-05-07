package com.sun.demo.variances3

abstract class AbstractMonoid[T] {
  def add(x: T, y: T): T
  def unit: T
}
