package com.project.work.device;

import com.project.work.entities.AbstractBaseEntity;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Entity;

@Data
@Builder
@Entity
public class DeviceEntity extends AbstractBaseEntity {
    private String attribute1;
    private String attribute2;
}
