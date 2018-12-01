# spring

标签（空格分隔）： java spring

---

Spring是轻量级的,Spring框架的基础版本是在2左右.
spring框架的核心特性可以用于开发任何java应用程序，但是在java ee 平台上构建web应用程序是需要扩展的.
##依赖注入
Spring最认同的技术是控制反转的**依赖注入**模式。控制反转(IoC)是一个通用概念，它可以用许多不同的方式去表达，依赖注入仅仅是控制反转的一个具体的例子。
依赖注入可以构造函数传递参数的方式发生，或者通过setter方法post-construction。
##面向切面的编程
Spring框架的一个关键组件是面向切面的程序设计（AoP）框架。一个程序跨越多个功能被称为横切关注点。
##体系结构
Spring有可能成为所有企业应用程序的一站式服务点，然而，spring是模块
化的，允许你挑选和选择适用于你的模块。
Spring框架提供约
个模块，可以根据应用程序的要求来使用。
![spring 模块][1]
##核心容器
核心容器由核心，bean,上下文和表达式语言模块组成，他们的细节如下：

 - **核心**模块提供了框架的基本组成部分，包括ioc和依赖注入功能
 - **Bean**模块提供BeanFactory,它是一个工厂模式的复杂实现。
 - **上下文**模块建立在由核心和Bean模块提供的坚实基础上，它是访问定义和配置的任何对象媒介。
 - **表达式语言**模块建立在运行时提供了查询和操作一个对象图的强大的表达式语言。

##数据访问/集成
数据访问/集成层包括JDBC,ORM,OXM,JMS和事物处理模块，他们的细节如下：


 - **JDBC**模块提供了删除多余的JDBC相关编码的JDBC抽象层。
 - **ORM**模块为流行的对象关系映射api,包括JAP,JDO,Hibernate和iBatis,提供了集成层。
 - **OXM**模块提供了抽象层，它支持对JAXB，Castor,XMLBeans,JiBx和XStream的对象/XML映射实现。
 -  java消息服务**JMS**模块包含生产和消费的信息的功能。
 - **事务**模块为实现特殊接口的类及所有的POJO支持编程式和声明式事务管理。
 
##WEB
web层有web.web-mvc,web-Socket和Web-Portlet组成，他们的细节如下：

 - **web**模块提供了基本的面向web的集成功能，例如多个文件上传的功能和使用servlet监听器和面向web应用程序的上下文来初始化IoC容器
 - **web-mvc**模块包含spring的模型-视图-控制器(MVC),实现了web应用程序。
 - **web-socket**模块为WebSocket-based提供了支持，而且在web应用程序中提供了客户端和fuwu服务端之间的通信的两种方式。
 - **web-portlet**模块提供了在portlet环境中实现mvc,并且反映了web_servlet模块的功能。
##其他
还有一些重要的模块，像AOP,Aspects.Istrumentation,web和测试模块，他们的细节如下：
 - **AOP**模块提供了面向切面的编程实现，允许你定义方法拦截器和切入点对代码进行干净的解耦，它实现了应该分离的功能。
 - **Aspects**模块提供了与AspectJ的集成，这是一个功能强大且成熟的面向切面编程(AOP)框架。
 - **Instrumentation**模块在一定的应用服务器中提供了类instrumentation的支持和类加载器的实现。
 - **Messaging**模块为STOMP提供了支持作为在应用程序中WebSocket子协议的使用。它支持一个注解编程模型，它是为了选路和处理来自webSocket客户端的STOMP信息。
 - **测试**模块支持对具有JUnit或TestNG框架的spring组件测试。

##IOC容器
Spring容器是Spring框架的核心。容器将创建对象，把它们连接在一起，配置它们，并管理它们的整个生命周期从创建到销毁。spring容器使用依赖注入(DI)来管理组成一个应用程序的组件。这些对象被称为SpringBeans。
通过读取配置，容器会对相应的对象进行实例化，配置和组装。配置可以通过xml,java注解或java代码来实现。
**spring**提供了以下两种不同类型的容器。


----------
**spring BeanFactory容器**

> 它是最简单的容器，给DI提供了基本的支持，他用org.springframework.beans.factory.BeanFactory接口来定义。BeanFactory或者相关的接口，如BeanFactoryAware,InitializingBean,DisposableBean,在spring中仍然存在具有大量的Spring整合的第三方框架反向兼容性的目的。

**SpringApplicationContext容器**

> 有BeanFactory容器所有功能，还有从一个文件解析文本，给事件监听器提供事件的功能。


**BeanFactory(功能是为依赖注入DI提供支持)**

> Spring中有大量接口实现了BeanFactory接口。常用的有**XMLBeanFactory**类。这个容器从一个xml文件中读取配置元数据，由这些数据来生成一个被配置化的系统或者应用。

**Spring ApplicationContext容器**

> 是spring中较高级的容器。和BeanFactory类似。它可以配置文件中定义的bean，将所有的bean集中在一起，当有请求的时候分配bean。另外，它增加了从属性文件中解析文本信息和将时间传递给所指定的监听器的功能。
**相比BeanFactory 推荐使用ApplicationContext**

##bean的定义
配置元数据信息：

 - 如何创建一个bean
 - bean的生命周期
 - bean的依赖关系
 
##spring配置元数据

 - 基于xml的配置文件
 - 基于注解的配置
 - 基于java代码的配置
 
##构成每个bean的属性


 - class 这个属性是强制性的，并且用来创建bean的。
 - name  唯一bean标识符。在基于xml的配置元数据中，你可以使用ID和/或name属性来制定bean标识符
 - scompe 这个属性指定bean的作用域
 - constructor-arg 用来注入依赖关系
 - properties 用来注入以来关系
 - autowiring mode 用来注入依赖关系
 - lazay-initialization mode 懒加载的bean，第一次请求才去创建bean,而不是启动时就去创建bean
 - initialization 初始化方法
 - destruction 容器销毁bean调用的方法
 
##bean的作用域
 - singleton 该作用域将bean定义为在spring IoC容器中只有单个实例。
 - prototype 该作用域将bean定义为任意数量实例
 - request   作用域在Http请求，只有在web-aware ApplicationContext的上下文中有效。
 - session HTTP会话当中，只有在web-aware SpringApplicationContext中有效。
 - global-session 全局Http会话中。只有在web-aware SpringApplicationContext中有效。
 
##singleton作用域：
如果作用域设置为singleton,那么Spring IoC容器刚好创建一个由该bean定义的对象的实例。该bean的实例将存储在缓存中，在后续的请求和引用都会返回缓存的对象。

##bean的生命周期
当一个bean被实例化时，它可能需要一些初始化使他转换为可用状态。同样，当bean不再需要时，相从容器中移除时，可能需要做一些清楚工作。
**init-method和destroy-method**

##依赖注入

 - Constructor-based dependency injection：当容器调用带有多个参数的构造函数类时，实现基于构造函数的DI,每个代表在其他类中的一个依赖关系
 - Setter-based dependency injection：基于setter方法的DI是通过在调用无参数的静态工厂方法实例化bean之后调用beans的setter方法来实现的。
 
**你可以混合使用这两种方法，基于构造函数和基于setter方法的DI，然而使用强制性依存关系的构造函数和有可选依赖关系的setter是一个很好的做法。
（也就是说要实例化bean，想初始化时依赖注入，用构造函数注入DI,想选择性实例化bean,可以用setter注入DI）

###注入内部bean
inner beans

    <bean id="" class="">
          <property name="">
             <bean id="innerbean" class=""/>
          </property>
    </bean>

###注入集合
<list>,<set>,<map>,props



##自动装配（减少xml配置和setter配置）


使用autowire属性
no 默认设置，没有自动装配

byname ：autowire属性为byname ,找相同名称进行注入
bytype : autowire为bytype 找相同类型来注入。
constructor: 构造函数
autodetect:首先尝试constructor自动装配来连接，否则bytype来自动装配。


##基于注解的配置

从Spring2.5开始可以使用**注解**来配置依赖注入。而不是采用xml来描述一个bean依赖注入，你可以使用相关类和方法或字段声明的注解，将bean配置移动到组件类本身。
注解依赖注入在默认情况下是关闭的。因此在使用注解依赖注入之前要在spring配置文件中启用它。

    <context:annotation-config/>

一旦被配置后，你就可以使用注解了，表明Spring能自动连接到属性，方法和构造函数。
**重要注解**

> **@Required**
>@Required注解用于bean属性的setter方法
**@Required表明受影响的bean必须放在xml配置文件中。否则容器就会抛出一个beanInitializationException异常。
> **@Autowired**
>@Autowired注解用于bean属性的setter方法,非setter方法，构造函数和属性
> **@Qualifier**
>@Required注解指定确切的连线bean
> **@JSR-250 Annotations**
>spring支持JSR-250的基础注解，其中包括了@Resource,@psotConstruct和@PreDestroy注解。
@PostConstruct作为初始化函数的一个替代，@predestry作为销毁函数的一个替代。

###基于java的注解
@configuration
该注解表示这个类可以使用Spring IoC容器作为Bean定义的来源。@Bean注解告诉Spring，一个带有@Bean的注解方法将返回一个对象，该对象已改被注册在Spring应用程序上下文的bean。


##spring中的事件处理
Spring的核心是ApplicationContext,他负责管理bean依赖关系。
Spring工作时ApplicationContext会发布一些类型的事件，例如：当上下文启动时，ContextStartedEvent被发布，当上下文停止时，ContextStoppedEvent发布。
我们可以通过ApplocationEvent类和ApplocationListener接口来处理ApplocationContext中的事件。
Spring提供了一下标准事件：

 1. ContextRefreshEvent
 2. ContextStartedEvent
 3. ContextStoppedEvent
 4. ContextClosedEvent
 5. RequestHandledEvent
 [详细参考][2]
有与spring的事件处理是单线程的，所以如果一个事件被发布，直至并且除非所有的接受者得到该消息，该进程会一直阻塞，并流程不会继续，所以要注意。

##Spring框架的AOP
Spring框架的一个关键组件是面向切面编程(AOP)。面向切面的编程需要把程序逻辑分解成不同的部分称为关注点。跨一个程序的多个点的功能被称为横切关注点，这些横切关注点在概念上独立于应用程序的业务逻辑。
[AOP参考][3]


##MVC框架教程
Spring web MVC提供了模型-视图-控制的体系结构和可以用来开发灵活，松散耦合的web应用程序的组件。MVC模式实现了应用程序的不同方面（输入逻辑，业务逻辑，UI逻辑）的分离，同时提供了在这些元素之间的松散耦合。

 - **模型**封装了应用程序数据模型，通常由POJO组成。
 - **视图**主要用于呈现模型数据，并且通常生成浏览器可解释的HTML输出。
 - **控制器**主要用于处理用户请求，并且构建合适的模型并将其传递到视图呈现出来。

 ###DispatcherSerlet

Spring Web 模型-视图-控制(MVC)框架是围绕DispatcherServlet设计的，DispatcherServlet用来处理所有的Http请求和响应。Spring MVC DispatcherServlet的请求处理的工作流程如下图所示：
![工作流程][4]

 - 收到一个Http请求后，DispatcherServlet根据HandlerMapping来选择并且调用适当的控制器。
 - 控制器接受请求,并根据请求GET或POST方式来调用Service方法。Service方法将通过业务逻辑模型数据来获取数据，并把视图名称返回给DispatcherServlet中。
 - DispatcherServlet会从ViewResolver获取帮助，为请求获取视图数据。
 - 然后DispatcherServlet将把模型数据传递给视图，最后一Http方式传递给浏览器呈现。

##请求配置
 你通过使用web.xml文件配置，你想让DispatcherServlet处理的请求。
 

    <web-app id="WebApp_ID" version="2.4"
    xmlns="http://java.sun.com/xml/ns/j2ee" 
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://java.sun.com/xml/ns/j2ee 
    http://java.sun.com/xml/ns/j2ee/web-app_2_4.xsd">
    <display-name>Spring MVC Application</display-name>
    <servlet>
      <servlet-name>HelloWeb</servlet-name>
      <servlet-class>
         org.springframework.web.servlet.DispatcherServlet
      </servlet-class>
      <load-on-startup>1</load-on-startup>
    </servlet>
    <servlet-mapping>
      <servlet-name>HelloWeb</servlet-name>
      <url-pattern>*.jsp</url-pattern>
    </servlet-mapping>
    </web-app>
web.xml文件被保存在你应用程序的WebContent/WEB-INF目录下。

如果你不想使用默认文件名 [servlet-name]-servlet.xml 和默认位置 WebContent/WEB-INF，你可以通过在 web.xml 文件中添加 servlet 监听器 ContextLoaderListener 自定义该文件的名称和位置，如下所示：

    <web-app...>
         <!-------- DispatcherServlet definition goes here----->
          ....
       <context-param>
           <param-name>contextConfigLocation</param-name>
           <param-value>/WEB-INF/HelloWeb-servlet.xml</param-value>
        </context-param>
        <listener>
           <listener-class>
              org.springframework.web.context.ContextLoaderListener
           </listener-class>
        </listener>
        </web-app>
        


            <beans xmlns="http://www.springframework.org/schema/beans"
           xmlns:context="http://www.springframework.org/schema/context"
           xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
           xsi:schemaLocation="
           http://www.springframework.org/schema/beans     
           http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
           http://www.springframework.org/schema/context 
           http://www.springframework.org/schema/context/spring-context-3.0.xsd">
        
           <context:component-scan base-package="com.tutorialspoint" />
        
           <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
              <property name="prefix" value="/WEB-INF/jsp/" />
              <property name="suffix" value=".jsp" />
           </bean>

       </beans>


一些要点：

 - [servlet-name]-servlet.xml文件将用于创建bean定义，重新定义在全局范围内具有相同名称的任何已定义的bean。
 - <context:conponent-scan base-package="com...."/>标签将用于激活Spring MVC注释扫描功能，该功能允许使用注解，如@Controller何@RequestMapping等等
 - InternalResourceViewResolver将使用定义的规则来解析视图名称。

##定义控制器
DispatcherServlet发送请求到控制器中执行特定功能。@Controller注释表明一个控制器的作用。@RequestMapping注解用于映射到整个类或一个特定的处理方法。
###创建jsp视图
对于不同的表示技术，SpringMVC支持许多类型的视图。包括JSP,HTML,PDF,Excel工作表,xml,Veocity模板，XSLT,json,atom和rss提要，JasperReports等等。但我们最常使用JSTL编写的JSP模板。
**还有比较重要的重定向，处理异常等**


##使用log4j 记录日志
log4j.properties配置文件内容

    # Define the root logger with appender file
    log4j.rootLogger = DEBUG, FILE
    # Define the file appender
    log4j.appender.FILE=org.apache.log4j.FileAppender
    # Set the name of the file
    log4j.appender.FILE.File=C:\\log.out
    # Set the immediate flush to true (default)
    log4j.appender.FILE.ImmediateFlush=true
    # Set the threshold to debug mode
    log4j.appender.FILE.Threshold=debug
    # Set the append to false, overwrite
    log4j.appender.FILE.Append=false
    # Define the layout for file appender
    log4j.appender.FILE.layout=org.apache.log4j.PatternLayout
    log4j.appender.FILE.layout.conversionPattern=%m%n

 
  [1]: htp://wiki.jikexueyuan.com/project/spring/images/arch1.png
  [2]: http://wiki.jikexueyuan.com/project/spring/event-handling-in-spring.html
  [3]: http://wiki.jikexueyuan.com/project/spring/aop-with-spring.html
  [4]: http://wiki.jikexueyuan.com/project/spring/images/mvc1.png