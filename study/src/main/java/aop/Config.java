package aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by jeremy on 2016/8/12.
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"aop"})
public class Config
{
}
