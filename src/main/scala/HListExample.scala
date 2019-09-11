import shapeless.HList._
import shapeless._


class HListExample {
  def print {

    //   Operations on scala List

    val list = 1 :: "knoldus" :: true :: Nil
    println(s"list=$list")
    println(list.head)
    println(list.tail)
     //println(list.tail.head.toUpprCase)
    println()


    //   Operations on  Shapeless HList

    val Hlist = 1 :: "knoldus" :: true :: HNil
    val k = Hlist :+ 4

    println(s"Hlist=$Hlist")
    println(Hlist.head)
    println(Hlist.tail)
    println(Hlist.tail.tail.head)
    println(Hlist.tail.head.toUpperCase)
    println(k)
  }
}

object HListExample1 extends App {
  val obj = new HListExample
  obj.print
}