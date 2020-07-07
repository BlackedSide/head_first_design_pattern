# 命令模式（Command Pattern）

### 概念
将请求封装成对象，这可以让你使用不同的请求、队列、或者日志请求来参数化其他对象。命令模式也可以支持撤销操作。

### 结构
- `command_pattern`包：定义了命令（`Command`）接口，所有命令都具有`execute()`与`undo()`方法。接口的实现`ConcreteCommand`定义了动作和接收者之间的绑定关系，它们只负责调用接收者（Receiver）的功能。
- `thing`包：定义了接收者（Receiver），实现物品的具体功能。
- `invoker`包：调用者，持有命令对象（ConcreteCommand），并能够调用命令对象的`execute()`与`undo()`方法。
- `client`包：客户端，创建命令对象（ConcreteCommand），并设置其接收者（Receiver）。

### 解释
实现了发出请求的对象与执行请求的对象解耦，之间通过命令对象沟通。

客户（Client，发出请求的对象）持有调用者（Invoker，发出请求的对象），通过向调用者传入命令对象（ConcreteCommand），使命令对象实现对接收者（Receiver，执行请求的对象）的操作（即执行请求）。