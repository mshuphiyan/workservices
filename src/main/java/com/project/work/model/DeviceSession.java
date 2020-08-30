package com.project.work.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@Builder
public class DeviceSession {
    private Integer sessionId;
    private Integer driverId;
    private Integer managerId;
    private String status;
    private String message;
    private Date last_updated_time;
}
