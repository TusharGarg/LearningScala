import com.sun.deploy.util.ArrayUtil

import scala.collection.mutable.ArrayBuffer

def map(list : Seq[Int], transform :Int => Int ) : Seq[Int] = {

  var result = Seq.empty[Int];
  val listIterator = list.iterator

  while(listIterator.hasNext) {
    val y = transform(listIterator.next())
    result = result.:+(y)
  }
  result
}

def map2(list : Seq[Int], transform :Int => Int ) : Seq[Int] = {

  def loop(remaining: Seq[Int], acc: Seq[Int]): Seq[Int] = {
    if (remaining.isEmpty) {
      acc
    }
    else {
      val ys = acc :+ transform(remaining.head)
      loop(remaining.tail, ys)
    }
  }

  loop(list,Seq.empty)
}

def filter[U](list:Seq[Int], f:Int => U) : Seq[U] = {
  var filteredList = ArrayBuffer.empty[U]
  val listIterator = list.iterator
  while(listIterator.hasNext) {
    val item = f(listIterator.next())
    if(item != -1)
      filteredList += item
  }
  filteredList
}

var buff = ArrayBuffer.empty[Int]
buff += 3
buff += 4
map2( 1 to 100, {value : Int => value + 1})
map(buff, {value : Int => if(value >3)value else -1})