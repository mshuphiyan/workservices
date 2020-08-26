package com.project.work.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
@Builder
public class Location {
    private Integer locationId;
    private String organization;
    private String facility;
    private String pointOfCare;
    private String room;
    private String bed;
    private Date last_updated_time;
}
