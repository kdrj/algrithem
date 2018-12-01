# mybatis学习笔记


标签（空格分隔）： java mybatis

---

mybatis是支持。
普通SQL查询，存储过程和高级映射的优秀的持久层框架。mybatis消除了几乎所有的JDBC代码和参数的手工设置以及结果集的检索。
**Mybatis使用简单的xml或者注解来映射原始数据，将接口和java POJOs映射成数据库中的记录**

###orm工具的基本思想
无论是hibernate,Mybatis都有共同点：

 1. 从配置文件中(通常是XML配置文件中）得到sessionfactory.
 2. 由sessionfafactory产生session
 3. 在session中完成对数据库的增删改查和事务提交等操作。
 4. 用完之后关闭session.
 5. 在java对象和数据库之间做mapping配置文件（xml配置文件）。
 

##开发环境搭建
设置mybatis配置文件：
以接口的方式编程
**还有分页比较重要**
[分页实例][1]
***动态sql比较重要***
主要有以下几项：
 

 1. if语句（简单的条件判断）
 2. choose(when,otherwize),相当于java语言中的switch,与jstl中的choose很类似
 3. trim(对包含的内容加上prefix或者suffix的
 4. where(主要是用来简化sql语句中where条件判断的，能智能处理and or,不必担心多余导致语法错误）
 5. set(主要用于更新时）
 6. foreach(在实现mybatis in 语句是特别有用）

##代码生成工具的使用

mybatis应用程序需要大量的配置文件，对于一个成百上千的数据库来说，完全手工配置，这是一个很恐怖的工作量。所以mybatis官方也推出了mybatis代码生成工具的jar包。
mybatis代码生成工具，主要有以下功能：

 1. 生成pojo与数据库结构对应
 2. 如果有主键，能匹配主键
 3. 如果没有主键，可以用其他字段去匹配
 4. 动态select,update,delete方法
 5. 自动生成接口（也就是以前的Dao层）
 6. 自动生成sqlmapper,增删改查各种语句，包括动态where语句配置
 7. 生成example供参考
 [参考][2]
##补充
在控制台显示sql语句（log4j实现）
传递多个参数的方法
缓存使用（为了提高性能，特别是从数据库中获取数据，默认开启一级缓存，类似于hibernate,也就是基于同一个sqlsession的查询语句，即session级别缓存，非全局缓存，或者非二级缓存）
要实现Mybatis的二级缓存，一般来说有如下两种方式：
 1.采用mybatis内置的catche机制
 2.采用第三方cache框架，比如ehcache,oscache等
[补充参考][3]


  [1]: http://wiki.jikexueyuan.com/project/mybatis-in-action/mybatis-paging.html
  [2]: http://wiki.jikexueyuan.com/project/mybatis-in-action/code-generation-tool.html
  [3]: http://wiki.jikexueyuan.com/project/mybatis-in-action/mybatis-supplement.html