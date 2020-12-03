package com.project.work.dao;

import com.project.work.model.Device;
import com.project.work.repository.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceRepository extends BaseRepository<Device, Long> {
}
