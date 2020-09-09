package com.project.work.device;

import com.project.work.device.DeviceEntity;
import com.project.work.repository.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceRepository extends BaseRepository<DeviceEntity, Long> {
}
