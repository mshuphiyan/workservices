package com.project.work.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@Builder
public class DeviceSession {
    private Integer sessionid;
    private Integer driverId;
    private Integer managerid;
    private String status;
    private String message;
    private Date last_updated_time;
}
