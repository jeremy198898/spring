package zconfig;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by jeremy on 2016/8/3.
 */
public class WebappWebInitializer implements WebApplicationInitializer
{
    @Override
    public void onStartup(ServletContext container) throws ServletException
    {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(WebpageConfig.class);
        ctx.setServletContext(container);

        ServletRegistration.Dynamic servletRegistration = container.addServlet("dispatcher", new DispatcherServlet(ctx));
        servletRegistration.setLoadOnStartup(1);
        servletRegistration.addMapping("/");
    }
}
