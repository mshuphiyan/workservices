package com.project.work.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@Builder
public class DeviceDriver {
    private Integer driverId;
    private String name;
    private String description;
    private String dllFilename;
    private String version;
    private Date last_updated_time;
}
