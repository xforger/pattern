### 观察者模式 　　
1.观察者和被观察者之间建立了一个抽象的耦合。<br>
2.观察者模式支持广播通信。<br>
3.观察者之间有过多的细节依赖、提高时间消耗及程序的复杂度。<br>
4.使用要得当，要避免循环调用。
###### 他和发布订阅模式是不一样的
1.观察者模式里，只有两个角色 —— 观察者 + 被观察者<br>
2.发布订阅模式里，不仅只有发布者和订阅者两个角色，还有一个经常被我们忽略的 —— 经纪人Broker<br>
3.观察者和被观察者，是松耦合的关系,发布者和订阅者，则完全不存在耦合<br>
4.观察者模式，多用于单个应用内部<br>
5.发布订阅模式，则更多的是一种跨应用的模式，比如我们常用的消息中间件
