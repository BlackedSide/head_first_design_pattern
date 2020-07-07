# 适配器模式（Adapter Pattern）

### 概念
将一个类的接口，转换成客户期望的另一个接口。适配器让原本接口不兼容的类可以合作无间。

### 结构
- `target`包，定义了一些具有不同接口的实例，这些接口之间有相似之处，但不完全相同。
- `adapater`包，定义了适配器。
- `client`包，测试。

`target`包中的`Duck`与`Turkey`具有相近的功能，可实现了不同接口的类有不同的行为方式。假设现有一个火鸡（Turkey）对象，想要借助鸭子（Duck）接口实现鸭子的功能（但本质上还是自身的特性）。则需要一个鸭子接口适配器，将持有具有火鸡接口的对象（组合），并实现了鸭子接口，在类内部重写鸭子接口的方法，却调用所持有的火鸡对象的方法。

如此，火鸡（client）能够使用鸭子接口实现鸭子接口所暴露的功能。（即，适配器允许客户使用新的库和子集合，而不需要改变自身代码。）

# 外观模式（Facade Pattern）
### 概念
提供一个统一的接口，用来访问子系统中的一群接口。外观定义了一个高层接口，让子系统更容易使用。

外观模式通过组合子系统中的组件，在外观接口中声明的方法用以实现自身持有的子系统组件的功能。功能实现交由子系统执行。客户只需要持有外观对象就可以方便地操作子系统的一系列行为，也允许客户直接调用子系统中的功能。