

class MyClass (val empID:Int, val empName:String, val salary:Int) /*Primary constructor*/ {
  
  /*Auxiliary constructors*/
  def this(empID:Int){
    this (empID, "Rajeev", 10000)
    
  }
  
  def this (empID:Int, empName:String) {
    this (empID, empName, 30000)
  }
  
 
  def printMsg():Unit = {
    println(empID + ": " + empName)
    
  }
  

}

object MyTestClass {
  
  def main(args:Array[String]):Unit = {
    
  val m = new MyClass(1001, "John", 10000)
  val m1 = new MyClass(2001)
  m.printMsg()
  m1.printMsg()
     
  }
  
}
