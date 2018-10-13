package com.yfzhang.test

class Outer{
  class Inner{
    private def f(){println("f")}
    class InnerMost{
      f() // 正确
    }
  }
  /*
  (new Inner).f( ) 访问不合法是因为 f 在 Inner 中被声明为 private，而访问不在类 Inner 之内。
  但在 InnerMost 里访问 f 就没有问题的，因为这个访问包含在 Inner 类之内。
  Java中允许这两种访问，因为它允许外部类访问内部类的私有成员。
   */
  //(new Inner).f() //错误

}
