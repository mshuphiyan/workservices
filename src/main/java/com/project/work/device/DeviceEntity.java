package com.project.work.device;

import com.project.work.entities.AbstractBaseEntity;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Builder
@Entity
@Table(name = "device")
public class DeviceEntity extends AbstractBaseEntity {

    @Column(name = "description")
    private String description;

    @Column(name = "device_type")
    private String device_type;

    @Column(name = "manufacturer")
    private String manufacturer;

    @Column(name = "device_mgr_id")
    private int device_mgr_id;

    @Column(name = "location_id")
    private int location_id;
}
