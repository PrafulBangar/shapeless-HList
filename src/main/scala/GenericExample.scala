import shapeless.{Generic, HNil}

case class Person(name: String, Id: Int, Active: Boolean)


object GenericExample extends App {

  val GenPerson = Generic[Person] //103-112
  //GenPerson: shapeless.Generic[Person]{type Repr = String :: Int :: Boolean :: shapeless.HNil} = anon$macro$4$1@4b93df61
  println(s"GenPerson=$GenPerson")

  val student = Person("Praful", 1, false)
  //student: Person = Person(Praful,1,false)
  println(s"student=$student")

  val repr = GenPerson.to(student)
  //repr: GenPerson.Repr = Praful :: 1 :: false :: HNil
  println(s"repr=$repr")


  val teacher = GenPerson.from(("knoldus" :: 3 :: true :: HNil))
  //teacher: Person = Person(knoldus,3,true)
  println(s"teacher=$teacher")

}