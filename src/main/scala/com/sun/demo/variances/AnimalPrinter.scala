package com.sun.demo.variances

class AnimalPrinter extends AbstractPrinter[Animal] {

  override def print(animal: Animal): Unit = {
    println("the animal's name is " + animal.name)
  }
}
