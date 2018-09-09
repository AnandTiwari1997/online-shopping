package com.anand.shoppingbackend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * This class contain all the configuration for the Databases.
 * 
 * @author Anand Tiwari
 *
 */

@Configuration
@ComponentScan(basePackages = "com.anand.shoppingbackend.dto")
@EnableTransactionManagement
public class HibernateConfig {

	private static final String DATABASE_URL = "jdbc:h2:tcp://localhost/~/onlineshopping";
	private static final String DATABASE_DRIVER = "org.h2.Driver";
	private static final String DATABASE_DIALECT = "org.hibernate.dialect.H2Dialect";
	private static final String DATABASE_USERNAME = "sa";
	private static final String DATABASE_PASSWORD = "";
	

	private static Logger logger = Logger.getLogger(HibernateConfig.class);

	/**
	 * DataSource will be available.
	 * 
	 * @return DataSource an DataSource object.
	 */
	@Bean
	public DataSource getDataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(DATABASE_DRIVER);
		dataSource.setUrl(DATABASE_URL);
		dataSource.setUsername(DATABASE_USERNAME);
		dataSource.setPassword(DATABASE_PASSWORD);
		return dataSource;
	}

	/**
	 * This method create SessionFactory.
	 * 
	 * @param dataSource
	 *            DataSource Object.
	 * @return SessionFactory Object.
	 */
	@Bean
	public SessionFactory getSessionFactory(DataSource dataSource) {
		logger.info("Created DataSource ... " + dataSource);
		LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(dataSource);
		builder.addProperties(getHibernateProperties());
		builder.scanPackages("com.anand.shoppingbackend.dto");
		logger.info("Builder of LocalSessionFactoryBuilder .. " + builder);
		return builder.buildSessionFactory();
	}

	/**
	 * This method set properties for Hibernate SessionFactory.
	 * 
	 * @return Properties Object.
	 */
	private Properties getHibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.dialect", DATABASE_DIALECT);
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.format_sql", "true");
		return properties;
	}

	/**
	 * This method will take care of Sessions.
	 * 
	 * @param sessionFactory
	 *            SessionFactory Object.
	 * @return HibernateTransactionManager Object.
	 */
	@Bean
	public HibernateTransactionManager geTransactionManager(SessionFactory sessionFactory) {
		return new HibernateTransactionManager(sessionFactory);
	}

}
