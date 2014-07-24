trait CanDrink[T,S]{

  def apply (age: T) :S
}

var NcrCanDrink = new CanDrink[Int,Boolean] {
  def apply (age: Int) = age > 15;
}


class Person(age:Int, isFemale:Boolean) {
  def isWise = if(isFemale)age > 18 else age > 21
  def canMarry(canDrink :CanDrink[Int, Boolean]) = isWise && canDrink.apply(age)
}


val person = new Person(20, false);
person.canMarry(NcrCanDrink)
