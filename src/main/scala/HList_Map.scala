import  shapeless.poly._
import shapeless.HNil
import shapeless.PolyDefns.~>


object HList_Map extends App {

  object filterHeads extends (Set ~> Option) {
    def apply[T](s: Set[T]) = s.headOption
  }

  //map operation
  val sets = Set(2, 4, 3) :: Set("pune", "knoldus") ::Set(2.2,"hi"):: Set() :: HNil
  val heads = sets map filterHeads
  println(s"Map Result=$heads")


  //flatmap operation

  val flist = ("knoldus" :: "Pune" :: HNil) :: HNil :: (true::"Inc"::1 :: HNil) :: HNil
  val result=flist flatMap identity
  println(s"flatmap Result=$result")
}
