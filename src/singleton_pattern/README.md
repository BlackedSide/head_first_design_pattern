# 单例模式（Singleton Pattern）

### 概念
确保一个类只有一个实例，并提供一个全局访问点。

### 适用场景举例
线程池、缓存、对话框、处理偏好设置和注册表的对象、日志对象、充当打印机和显卡等驱动程序的对象、等。

### 结构
#### 特定
- 类构造器私有
- 持有自己类型的属性
- 对外提供获取实例的静态方法

#### 包中代码解释
- Singleton_Lazy，懒汉模式，线程不安全，非严格意义上的单例。
- Singleton_Hunger，饿汉模式，线程安全，因为其一开始就初始化出对象，但容易导致无谓的资源占用。
- Singleton_DCL，双重锁模式，线程安全，使用`volatile`关键字避免指令重排序，使用双重检查进行同步。