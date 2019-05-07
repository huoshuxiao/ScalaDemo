# 参数
## 1. 传名参数
### 关键字
`
 =>
`
### demo
`
def loop(condition: => Boolean)(body: => Unit): Unit = {
    if (condition) {
      body
      loop(condition)(body)
    }
}
`
#### 参数为逻辑体，在被调用时执行逻辑体(逻辑体在调用处书写)
___
## 2. 传值参数

### demo
`
def add(x: Int) = x + 37
`
___
## 3. 柯里化参数(函数)
### demo 必须有返回值
`
def add()() = {}
`
#### 函数式编程