package net.vkits.platform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
//TODO chi 暂时不启动mysql
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
//@SpringBootApplication
public class WechatWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WechatWebApplication.class, args);
	}
}
