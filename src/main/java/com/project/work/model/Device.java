package com.project.work.model;

import com.project.work.entities.AbstractBaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "device")
public class Device extends AbstractBaseEntity {
    private String description;
    private String device_type;
    private String manufacturer;
    private Integer device_mgr_id;
    private Integer location_id;
}
