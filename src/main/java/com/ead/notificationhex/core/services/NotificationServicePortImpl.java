package com.ead.notificationhex.core.services;

import java.util.List; 
import java.util.Optional;
import java.util.UUID;

import com.ead.notificationhex.core.domain.NotificationDomain;
import com.ead.notificationhex.core.domain.Pageinfo;
import com.ead.notificationhex.core.domain.enums.NotificationStatus;
import com.ead.notificationhex.core.ports.NotificationPersistencePort;
import com.ead.notificationhex.core.ports.NotificationServicePort;


public class NotificationServicePortImpl implements NotificationServicePort {
	
	private final NotificationPersistencePort notificationPersistencePort;

	public NotificationServicePortImpl(NotificationPersistencePort notificationPersistencePort) {	
		this.notificationPersistencePort = notificationPersistencePort;
	}	

	@Override
	public NotificationDomain saveNotification(NotificationDomain notificationDomain) {
		return this.notificationPersistencePort.save(notificationDomain);		
	}

	@Override
	public List<NotificationDomain> findAllNotificationByUser(UUID userId, Pageinfo pageInfo) {		
		return notificationPersistencePort.findAllByUserIdAndNotificationStatus(userId , NotificationStatus.CREATED , pageInfo);
	}

	@Override
	public Optional<NotificationDomain> findByNotificationIdAndUserId(UUID notificationId, UUID userId) {
		return notificationPersistencePort.findByNotificationIdAndUserId(notificationId, userId);

	}

}
