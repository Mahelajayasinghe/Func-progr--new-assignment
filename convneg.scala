object convneg extends App{
  val x=new Rational (-1 , 5)
  println (x.neg)
}
class Rational(a:Int , b:Int){
  val numer = a
  val denom = b
  def neg = new Rational(-numer ,denom)
  override def toString() :String = 
  {
    numer + "/" + denom
  }
}