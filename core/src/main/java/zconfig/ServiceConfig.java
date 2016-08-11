package zconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jeremy on 2016/8/4.
 */
@Configuration
@ComponentScan(basePackages = {"service"})
public class ServiceConfig
{

    //显式配置
//    @Bean
//    public ServiceTest entityTest()
//    {
//        return new ServiceTest();
//    }
}
