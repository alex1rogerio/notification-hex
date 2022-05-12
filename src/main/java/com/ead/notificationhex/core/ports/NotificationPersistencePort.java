package com.ead.notificationhex.core.ports;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.ead.notificationhex.core.domain.NotificationDomain;
import com.ead.notificationhex.core.domain.Pageinfo;
import com.ead.notificationhex.core.domain.enums.NotificationStatus;

public interface NotificationPersistencePort {
	
	NotificationDomain save(NotificationDomain notificationDomain);
	List<NotificationDomain> findAllByUserIdAndNotificationStatus(UUID userId , NotificationStatus notificationStatus, Pageinfo pageinfo );
	Optional<NotificationDomain> findByNotificationIdAndUserId(UUID notificationId , UUID userId);
}
