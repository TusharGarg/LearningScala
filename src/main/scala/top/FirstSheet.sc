

var NcrCanDrink = {age:Int => age > 15;}


class Person(age:Int, isFemale:Boolean) {
  def isWise = if(isFemale)age > 18 else age > 21
  def canMarry(canDrink :Int => Boolean) = isWise && canDrink(age)
}


val person = new Person(20, false);
person.canMarry(age => age>10)

val person2 = new Person(22, true);
person2.canMarry(NcrCanDrink)
