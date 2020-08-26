package com.project.work.model;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Device {
    private String name;
    private String model;
    private String description;
    private String device_type;
    private String manufacturer;
    private Integer device_mgr_id;
    private Integer location_id;
    private int active;
    private Date last_updated_time;
}
