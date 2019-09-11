import shapeless.{HList, HNil}

case class SizeHList[L<:HList](getlength:Int)

object SizeHList  {
  implicit val hnilsize = SizeHList[HNil](0)

  implicit def gettailsize[H, T <: HList](implicit tailsize: SizeHList[T]) =
    SizeHList[H::T](1 + tailsize.getlength)

  def apply[L <: HList](l: L)(implicit size: SizeHList[L]): Int = size.getlength
}
