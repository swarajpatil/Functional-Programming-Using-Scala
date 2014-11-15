package HigherOrderFun

object HigherOrderFunSample {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def add = (a:Int,b:Int) => a+b                  //> add: => (Int, Int) => Int
  add(5,10)                                       //> res0: Int = 15
  
  def cube(x:Int): Int = x * x * x                //> cube: (x: Int)Int
  
  def mul = (a:Int,b:Int) => a*b                  //> mul: => (Int, Int) => Int
  
  def sum(f:Int=>Int,a:Int,b:Int):Int =
	{
			if (a>b) 0 else f(a)+sum(f,a+1,b)
	}                                         //> sum: (f: Int => Int, a: Int, b: Int)Int
  
  def sumcube(a:Int,b:Int) : Int = sum(cube,a,b)  //> sumcube: (a: Int, b: Int)Int
	
	sumcube(2,5)                              //> res1: Int = 224
	
	def sumSquare(a:Int,b:Int) : Int = sum(x=>x*x,a,b)
                                                  //> sumSquare: (a: Int, b: Int)Int
                                                  
   def addition(a:Int) =  a + 5                   //> addition: (a: Int)Int
		addition(10)                      //> res2: Int = 15
}