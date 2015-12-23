package com.medical.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.dialect.MySQLDialect;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate3.HibernateTransactionManager;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;

@Configuration
public class HibernateConfiguration {

    @Value("#{dataSource}")
    private DataSource dataSource;

    @Bean
    public AnnotationSessionFactoryBean sessionFactoryBean() {
        Properties props = new Properties();
        props.put("hibernate.dialect", MySQLDialect.class.getName());

        props.put("hibernate.show_sql", "true");
        props.put("hibernate.format_sql", "true");

        AnnotationSessionFactoryBean bean = new AnnotationSessionFactoryBean();
        bean.setPackagesToScan(new String[] { "com.medical.bean" });
        bean.setHibernateProperties(props);
        bean.setDataSource(this.dataSource);
        bean.setSchemaUpdate(true);
        return bean;
    }

    @Bean
    public HibernateTransactionManager transactionManager() {
        return new HibernateTransactionManager(sessionFactoryBean().getObject());
    }

}
