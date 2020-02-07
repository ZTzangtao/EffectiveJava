#第15条：使类和成员的可访问性最小化
***私有的（private）***--只有在声明该成员的顶层类内部才可以访问这个成员.  
***包级私有的（package-private）***——声明该成员的包内部的任何类都可以访问这个成员。从技术上讲，它被称为"缺省"(default)访问级别，如果没有成员指定访问修饰符，就采用这个访问级别(当然，接口成员除外，它们默认的访问级别是公有的).  


```java
//potential security hole!
public static final Things[] VALUES = { ... };
```