package com.project.work.repository;

import com.project.work.entities.AbstractBaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

@NoRepositoryBean
public interface BaseRepository<T extends AbstractBaseEntity, ID extends Serializable>
extends JpaRepository<T, ID> {
}
