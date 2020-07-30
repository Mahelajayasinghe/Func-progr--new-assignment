object transfer extends App{
  val ac1 = new acc (10057841 , 5433.50)
  val ac2 = new acc (12511897 , 9812.20)
  println("\nBefore the transfer")
  println (ac1)
  println (ac2)
  ac2.trans (ac1, 1250.20)
  println("\nAfter the transfer")
  println (ac1)
  println (ac2)
}

class acc (x:Int,y:Double) {
  val accno : Int = x
  var accbal : Double = y
  override def toString = "Account number: " +accno+ ", Balance " +accbal
  def withdraw (k:Double) = accbal = accbal-k
  def deposit (k:Double) = accbal = accbal+k
  def trans(i:acc,j:Double)=
  {
    withdraw(j)
    i.deposit(j)
  }
}