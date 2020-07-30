object rationsub extends App{
  val x = new Rational (3,4)
  val y = new Rational (5,8)
  val z = new Rational (2,7)
  val ans1= y+z
  val fians= x-ans1
  println(fians)
}

class Rational(a:Int,b:Int){
  val numer = a
  val denom = b
  def neg = new Rational(-numer , denom)
  def + (k:Rational) = new Rational(numer * k.denom + denom* k.numer, k.denom* denom)
  def - (k:Rational)= this + k.neg
  override def toString() :String = 
  {
    numer + "/" + denom
  }
}