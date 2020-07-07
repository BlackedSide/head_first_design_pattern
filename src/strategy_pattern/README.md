# 策略模式（Strategy Pattern）

### 概念
策略模式定义了算法族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化独立于使用算法的客户。

### 结构与解释
#### behavior包
该包中定义了行为的接口与实现。每一个实现类都是一种行为，从而将行为从实体（substance）中抽象出来，实现复用。

- `FlyBehavior`接口
- `QuackBehavior`接口
- `FlyWithWings`类和`FlyNoWay`类分别定义了可以通过翅膀飞行与不能飞行两种行为（即两种算法）。
- 同样的，`QuackBehavior`的实现类们也代表了一组算法族。

#### substance包
该包中定义了不同的实体类，如`Duck`类（抽象类），该类中定义了`FlyBehavior`与`QuackBehavior`类型的变量，并通过setter方法使其在运行时动态绑定。

`performFly()`与`performQuack()`方法声明`Duck`类所具有的行为，该行为通过传入的behavior实现类来动态绑定自身的具体类型。

- `Duck`抽象类
- 继承了`Duck`类的`MallardDuck`类
- 独立的`DuckCall`（鸭鸣器）中同样可以使用behavior中的行为，从而实现了行为与实体的解耦。