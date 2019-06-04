package cn.haoke.dubbo.server.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by RookieWangZhiWei on 2019/6/4.
 */
@MapperScan("cn.haoke.dubbo.server.mapper")
@Configuration
public class MybatisConfig {

}
