package com.ead.notificationhex.core.ports;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.ead.notificationhex.core.domain.NotificationDomain;
import com.ead.notificationhex.core.domain.Pageinfo;

public interface NotificationServicePort {

	NotificationDomain saveNotification(NotificationDomain notificationDomain);

	List<NotificationDomain> findAllNotificationByUser(UUID userId, Pageinfo pageable);

	Optional<NotificationDomain> findByNotificationIdAndUserId(UUID notificationId, UUID userId);

}
