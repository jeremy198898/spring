package jpa.zconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jeremy on 2016/8/16.
 */
@Configuration
@ComponentScan(basePackages = {"jpa.service","jpa.dao"})
public class BeanConfig
{
}
