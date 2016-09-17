package jpa.zconfig;

import org.infinispan.manager.DefaultCacheManager;
import org.infinispan.manager.EmbeddedCacheManager;
import org.infinispan.spring.provider.SpringEmbeddedCacheManager;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created by jeremy on 2016/8/3.
 */
@Configuration
@EnableTransactionManagement
@EnableCaching
public class PersistenceConfig
{
        @Bean
        public LocalContainerEntityManagerFactoryBean entityManagerFactory()
        {
            LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
            em.setDataSource(MysqlDS());
            //这里如果不加Unitname 那么容器默认的 persistence unit name 为 default
            em.setPersistenceUnitName("mysql");
            em.setPackagesToScan("jpa.entity");

            JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
            em.setJpaVendorAdapter(vendorAdapter);
            em.setJpaProperties(additionalProperties());

            return em;
        }

    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory emf)
    {
        JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(emf);
        return transactionManager;
    }

    //transfer jpa exception to spring container
    @Bean
    public PersistenceExceptionTranslationPostProcessor exceptionTranslationPostProcessor()
    {
        return new PersistenceExceptionTranslationPostProcessor();
    }

    //datasource
    @Bean
    public DataSource MysqlDS()
    {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://140.206.185.206:3306/zzd?useSSL=false&useUnicode=true&characterEncoding=utf-8");
        ds.setUsername("jeremy");
        ds.setPassword("e3,t6,P?");
        return ds;
    }

    Properties additionalProperties()
    {
        Properties properties = new Properties();
        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL57InnoDBDialect");
        properties.setProperty("hibernate.show_sql", "true");

        //for caching
        properties.setProperty("hibernate.cache.use_second_level_cache", "true");
        properties.setProperty("hibernate.cache.use_query_cache", "true");
        properties.setProperty("hibernate.cache.region.factory_class", "org.hibernate.cache.infinispan.InfinispanRegionFactory");
        properties.setProperty("hibernate.cache.use_second_level_cache", "LRU");

        //properties.setProperty("hibernate.cache.infinispan.entity.eviction.max_entries", "5000");
        //properties.setProperty("hibernate.cache.infinispan.entity.expiration.max_idle", "30000");
        return properties;
    }

    @Bean
    public CacheManager cacheManager(){
        SpringEmbeddedCacheManager secm = new SpringEmbeddedCacheManager(infinispan());
        return secm;
    }

    private EmbeddedCacheManager infinispan(){
        return new DefaultCacheManager();
    }

}
