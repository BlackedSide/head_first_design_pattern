# 观察者模式（Observer Pattern）

### 概念
在对象之间定义一对多的依赖，这样一来，当一个对象改变状态，依赖它的对象都会收到通知，并自动更新。

### 结构
- `Subject`接口定义主题的规范；
- `WeatherData`类是一个主题的实现，即可被观察者（Observable），其中定义了一个观察者列表，并将自身的变化通知所有的观察者，所有注册为观察者的对象都能够自动接收改变。
- `Observer`和`DisplayElement`接口规范了观察者需要具有的行为，即获取更新的能力与显示更新的能力。
- `CurrentConditionsDisplay`测试了观察者的实现。一旦被观察者出现更新，观察者会自动的获取更新数据（由被观察者**推送**），并显示更新。