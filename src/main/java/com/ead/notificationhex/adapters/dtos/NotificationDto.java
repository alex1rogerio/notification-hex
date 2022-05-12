package com.ead.notificationhex.adapters.dtos;

import javax.validation.constraints.NotNull;

import com.ead.notificationhex.core.domain.enums.NotificationStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotificationDto {
	
	@NotNull
	private NotificationStatus notificationStatus ;

}
