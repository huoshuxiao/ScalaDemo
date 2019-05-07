package com.sun.demo.variances

class AnimalLog extends AbstractLog[Animal] {

  override def log[U >: Animal](u: U): Unit = {
    println("the animal's name is " + u)
  }
}
