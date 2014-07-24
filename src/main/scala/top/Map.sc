import scala.collection.mutable.ArrayBuffer

def map[U](list : Seq[Int], transform :Int => U ) : Seq[U] = {

  val x = ArrayBuffer.empty[U]
  val listIterator = list.iterator

  while(listIterator.hasNext) {
    x +=  transform(listIterator.next())
  }
  x
}

var buff = ArrayBuffer.empty[Int]
buff += 3
buff += 4

map(buff, {value : Int => value + 1})