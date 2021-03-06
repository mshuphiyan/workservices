package com.project.work.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class DeivceConnection {
    private Integer connectionId;
    private String connectionType;
    private String description;
    private Integer driverId;
    private Integer deviceId;
    private Integer ipAddress;
    private Integer port;
    private Integer active;
    private String gender;
}
