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
public class DeviceManager {
    private Integer managerid;
    private String name;
    private String description;
    private String ipaddress;
    private Integer port;
    private Date last_updated_time;
}
