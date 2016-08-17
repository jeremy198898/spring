package bean.zconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jeremy on 2016/8/16.
 */
@Configuration
@ComponentScan(basePackages = {"bean.beans", "bean.services"})
public class BeanConfig
{
}
