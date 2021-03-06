package debug

trait T {

  val valInTrait = "valInTrait"

  def defInTrait() = "defInTrait"

  def foo(): Unit = {
    // following line contains breakpoint, defined in TestValues.TraitsTestCase
    val bp = 1
  }
}

class C extends T {
  val valInClass = "valInClass"

  def defInClass() = "defInClass"

  override def toString = "C"
}

object Traits extends App {
  val c = new C()
  c.foo()
}