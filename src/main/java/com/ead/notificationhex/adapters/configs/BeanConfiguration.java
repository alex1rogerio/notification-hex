package com.ead.notificationhex.adapters.configs;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.ead.notificationhex.EadNotificationHexApplication;
import com.ead.notificationhex.core.ports.NotificationPersistencePort;
import com.ead.notificationhex.core.services.NotificationServicePortImpl;

@ComponentScan(basePackageClasses = EadNotificationHexApplication.class)
@Configuration
public class BeanConfiguration {
	
	@Bean
	NotificationServicePortImpl notificationServicePortImpl(NotificationPersistencePort persistence) {
		return new NotificationServicePortImpl(persistence); 
	}
	
	@Bean
	ModelMapper modelMapper() {
		return new ModelMapper();
	}
	

}
