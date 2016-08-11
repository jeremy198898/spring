package zconfig;

import impl.ServiceTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jeremy on 2016/8/4.
 */
@Configuration
@ComponentScan(basePackages = {"impl"})
public class OtherBeanConfig
{

}
