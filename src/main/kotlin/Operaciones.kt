class Operaciones {
    private var a : Double = 0.0
    private var b : Double = 0.0
    constructor()

    constructor(a:Double,b:Double){
        this.a = a
        this.b =b
    }
    // Getter para 'a'
    fun  getA():Double {
        System.out.println("Obteniendo el valor de a: $a");
        return a;
    }

    // Setter para 'a'
    fun setA(a :Double) {
        System.out.println("Estableciendo el valor de a a $a");
        this.a = a;
    }

    // Getter para 'b'
    fun getB() :Double {
        System.out.println("Obteniendo el valor de b:  $b");
        return b;
    }

    // Setter para 'b'
    fun setB(b:Double ) {
        System.out.println("Estableciendo el valor de b a $b");
        this.b = b;
    }
   fun cuadrado(x:Double){
       var res =Math.pow(x,2.0)
       println(res)


   }



}