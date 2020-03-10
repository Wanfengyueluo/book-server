package com.wan;

/**
 * @author wanfeng
 * @date 2020/1/31 13:46
 */
import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableSwagger2Doc
public class App {
  public static void main(String[] args) {
    // 这句不加，虚拟机上项目无法启动
    System.setProperty("es.set.netty.runtime.available.processors", "false");
    SpringApplication.run(App.class, args);
  }
}
