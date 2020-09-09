package com.project.work.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.io.Serializable;

@MappedSuperclass
public class AbstractBaseEntity implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    @Version
    private int version;
}
