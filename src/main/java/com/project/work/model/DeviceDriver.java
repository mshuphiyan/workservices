package com.project.work.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@Builder
@AllArgsConstructor
public class DeviceDriver {
    private Integer driverid;
    private String name;
    private String description;
    private String dllfilename;
    private String version;
    private Date last_updated_time;
}
