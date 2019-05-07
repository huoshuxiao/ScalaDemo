package com.sun.demo

import com.sun.demo.variances._

// 型变 (多态)
object VariancesMain {
  def main(args: Array[String]): Unit = {

    val dog: Dog = new Dog
    val dogPrinter: DogPrinter = new DogPrinter
    dogPrinter.print(dog)

    val aPrinter: AbstractPrinter[Animal] = new AnimalPrinter
    aPrinter.print(dog)


    val cat: Cat = new Cat
    var aLog: AbstractLog[Animal] = new AnimalLog
    aLog.log(cat.name)
  }
}
