package zconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created by jeremy on 2016/8/3.
 */
@Configuration
public class PersistenceConfig
{
        @Bean
        public LocalContainerEntityManagerFactoryBean entityManagerFactory()
        {
            LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
            em.setDataSource(MysqlDS());
            em.setPackagesToScan();

            JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
            em.setJpaVendorAdapter(vendorAdapter);
            em.setJpaProperties(additionalProperties());

            return em;
        }

    @Bean
    public DataSource MysqlDS()
    {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://140.206.185.206:3306/zzd");
        ds.setUsername("jeremy");
        ds.setPassword("e3,t6,P?");
        return ds;
    }

    Properties additionalProperties()
    {
        Properties properties = new Properties();
        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL57InnoDBDialect");
        return properties;
    }

}
