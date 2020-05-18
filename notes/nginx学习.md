#nginx工作原理





























Nginx的location语法
location [=|~|~*|^~] /uri/ { … }
=         严格匹配。如果请求匹配这个location，那么将停止搜索并立即处理此请求
~         区分大小写匹配(可用正则表达式)
~*       不区分大小写匹配(可用正则表达式)
!~       区分大小写不匹配
!~*     不区分大小写不匹配
^~      如果把这个前缀用于一个常规字符串,那么告诉nginx 如果路径匹配那么不测试正则表达式

root    实际访问文件路径会拼接URL中的路径
alias   实际访问文件路径不会拼接URL中的路径

（1）last 和 break 当出现在location 之外时，两者的作用是一致的没有任何差异

（2）last 和 break 当出现在location 内部时：

last        使用了last 指令，rewrite 后会跳出location 作用域，重新开始再走一次刚才的行为
break    使用了break 指令，rewrite后不会跳出location 作用域，它的生命也在这个location中终结

rewrite … permanent   永久性重定向，请求日志中的状态码为301
rewrite … redirect         临时重定向，请求日志中的状态码为302
