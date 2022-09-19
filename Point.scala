object Point extends App {

    var a = Point(3,5)
    var b = Point(8,1)
    
    println(a.add(b))

    a.move(x = 6, y = 2)
    println(a)
    
    var c = a.distance(b)
    println(c)

    a.invert()
    println(a)
}
case class Point(var x: Int, var y: Int) {
    def add(a:Point) =  Point(this.x + a.x, this.y + a.y)

    def move(x:Int, y:Int):Unit = {
        this.x = this.x + x
        this.y = this.y + y
    }

    def distance(a:Point) : Double = {
        var p:Int = this.x - a.x
        var q:Int = this.y - a.y
        var d: Int = p*p + q*q
        scala.math.sqrt(d)
    }

    def invert() :Unit = {
        var tmp = this.x
        this.x = this.y
        this.y = tmp
    }

}