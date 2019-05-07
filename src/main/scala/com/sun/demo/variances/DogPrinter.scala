package com.sun.demo.variances

class DogPrinter extends AbstractPrinter[Dog] {

  override def print(dog: Dog): Unit = {
    println("the dog's name is " + dog.name)
  }
}
