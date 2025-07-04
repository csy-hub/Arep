# Arep

该仓库包含一个简单的 Java 程序 `DailyMenuGenerator`，可以随机生成每日菜单。

## 编译与运行

```bash
javac src/DailyMenuGenerator.java
java -cp src DailyMenuGenerator [天数]
```

程序会从预设的早餐、午餐和晚餐菜单中各随机选择一道菜，并输出当天的菜单。
如果在运行程序时指定一个整数参数，例如 `java -cp src DailyMenuGenerator 3`，
则会生成对应天数的菜单。
