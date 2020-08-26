package com.project.work.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@Builder
public class DeviceManager {
    private Integer managerId;
    private String name;
    private String description;
    private String ipaddress;
    private Integer port;
    private Date last_updated_time;
}
