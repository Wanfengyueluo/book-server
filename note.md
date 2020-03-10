:100: 虚拟机部署项目出错，原因是ES和Redis的包冲突，需要在启动类中添加
`System.setProperty("es.set.netty.runtime.available.processors", "false");`
:100: 注意Spark与Spring Boot的启动顺序，先启动Spring Boot
:100:将埋点时机放在书籍推荐列表是否存在之后，避免实时推荐服务出错