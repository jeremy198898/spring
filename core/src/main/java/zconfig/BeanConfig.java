package zconfig;

import daoimpl.EntityTestImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jeremy on 2016/8/4.
 */
@Configuration
@ComponentScan(basePackages = {"service"})
public class BeanConfig {

    //显式配置
    @Bean
    public EntityTestImpl entityTest()
    {
        return new EntityTestImpl();
    }
}
