import shapeless._
import shapeless.syntax.std.tuple._

object TupleExample extends App {

  val tuple = (12, "Knoldus", true)
  val tupletoHlist = tuple.productElements                //tuple to Hlist conversion
  println(s"tupletoHList=$tupletoHlist")



  val hlist = 1 :: "knoldus" :: 2.5 :: true :: HNil
  val hlistToTuple = hlist.tupled                         //Hlist to tuple conversion
println(s"hlistToTuple=$hlistToTuple")


  println(s"tuple.reverse=${tuple.reverse}")
  println(s"tuple.tail=${tuple.tail}")
  println(s"tuple :+ 1=${tuple :+1}")
  println(s"hlist.reverse=${hlist.reverse}")
  println(s"hlist :+ 4=${hlist :+ 4}")
}
