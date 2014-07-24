

var NcrCanDrink = {age:Int => age > 15;}
class Person(age:Int, isFemale:Boolean) {
  def isWise = if(isFemale)age > 18 else age > 21
  def canMarry(canDrink :Int => Boolean) = isWise && canDrink(age)
}

def canMarry = {age:Int => age > 10 }
val person = new Person(20, false);
person.canMarry(canMarry )
val person2 = new Person(22, true);
person2.canMarry(NcrCanDrink)
def max(x: Int): Int = x * x

val s = max _

s.apply(3)

def abc(f: Int => Int) = { f.apply(3) }


abc(max)